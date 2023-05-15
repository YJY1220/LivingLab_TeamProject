package com.guri.loginkt_new.trash_bin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.guri.loginkt_new.databinding.FragmentNotificationBinding


class NotificationFragment: Fragment() {

    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    private fun replaceFragment(fragment: Fragment) {
//        // Get a reference to the FragmentManager
//        // Start a new FragmentTransaction
//        // Replace the current fragment with the new fragment
//        supportFragmentManager.beginTransaction()
//            .apply {
//                replace(R.id.fragmentCotainer,fragment)
//                commit()
//            }
//    }
}


//class NotificationFragment : Fragment(R.layout.fragment_notification) {
//
//    // 바인딩 객체 타입에 ?를 붙여서 null을 허용 해줘야한다. ( onDestroy 될 때 완벽하게 제거를 하기위해 )
//    private var mBinding: FragmentNotificationBinding? = null
//    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
//    private val binding get() = mBinding!!
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // 액티비티 와는 다르게 layoutInflater 를 쓰지 않고 inflater 인자를 가져와 뷰와 연결한다.
//        mBinding = FragmentNotificationBinding.inflate(inflater, container, false)
//        val profileList = arrayListOf(
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00")
//        )
//
//        // Set the adapter
//        if (view is RecyclerView) {
//            val context: Context = binding.rvPro1.getContext()
//            val mRecyclerView = view
//            mRecyclerView.setHasFixedSize(true)
//
//
//            // use a linear layout manager
//            mLayoutManager = LinearLayoutManager(context)
//            mRecyclerView.layoutManager = mLayoutManager
//
//
//            // specify an adapter (see also next example)
//            mAdapter = CollectionListAdapter(myList)
//            mRecyclerView.adapter = mAdapter
//        }
//        return view
//
//        // 세로 방향으로 리스트 만들고있으니까 VERTICAL
//        binding.rvPro1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        binding.rvPro1.setHasFixedSize(true)
//        binding.rvPro1.adapter = NotificationListAdapter(profileList)
//        return binding.root
//    }
//
//
//    // 프래그먼트가 destroy (파괴) 될때..
//    override fun onDestroyView() {
//        // onDestroyView 에서 binding class 인스턴스 참조를 정리해주어야 한다.
//        mBinding = null
//        super.onDestroyView()
//    }
//
//
//}