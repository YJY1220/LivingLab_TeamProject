package com.guri.loginkt_new.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.guri.loginkt_new.R
import com.guri.loginkt_new.databinding.FragmentBfselectionBinding
import com.guri.loginkt_new.databinding.FragmentCalendarBinding
import com.guri.loginkt_new.recyclerView.ListHorizontalAdapter
import com.guri.loginkt_new.recyclerView.ListVertical
import com.guri.loginkt_new.recyclerView.MyViewPager
import com.guri.loginkt_new.recyclerView.MyViewPagerAdapter


class bfselectionFragment : Fragment(R.layout.fragment_bfselection) {

    private var _binding: FragmentBfselectionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    lateinit var viewPager_aespa: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        _binding = FragmentBfselectionBinding.inflate(inflater, container, false)
        val view = binding.root

        var vpList = arrayListOf(
            MyViewPager("피그마 제작하기", "스플래시 화면에 넣을 로고 완성하기\n상단바, 하단바 만들고 프래그먼트로 연결하기","5월 10일 9시"),
            MyViewPager("코틀린 프론트엔드 구현하기", "메인화면, 지도 기능 프래그먼트 연결\n로그인, 회원가입 페이지 구현하기","5월 19일 16시"),
            MyViewPager("코틀린 프론트엔드 완성하기", "일정, 기여도 확인 기능 연결\n마이페이지, 알림 기능 구현하기","5월 26일 10시")
        )

        binding.viewPagerAespa.adapter = MyViewPagerAdapter(vpList)

        binding.viewPagerAespa.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // 저장하기 버튼 누르면 넘어가게
        binding.btnMe.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentCotainer, calendarFragment()).commit()
        }

        return view
    }
}