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
            MyViewPager("물리1", "오답노트 작성하기\n완자 p11-p30 문제풀이","5월 10일 9시"),
            MyViewPager("수학2", "EBS 강의 3강-6강 듣기\n쎈 p110-130 문제풀이","5월 19일 16시"),
            MyViewPager("화학1", "EBS 강의 5강 듣기\n수능특강 2단원 문제풀이","5월 26일 10시")
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