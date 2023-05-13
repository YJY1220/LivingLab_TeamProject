package com.guri.loginkt_new.trash_bin


//class notificationFragment : Fragment(R.layout.fragment_notification) {
//    // 뷰바인딩 사용하기 위해 추가 (3)
//    private lateinit var binding: FragmentNotificationBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // binding 사용하기 위해 추가 (4)
//        binding = FragmentNotificationBinding.inflate(layoutInflater)
//
//        val profileList = arrayListOf(
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
//            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00")
//        )
//
//        val myAdapter1= NotificationListAdapter(profileList)
//        binding.rvPro1.adapter = myAdapter1
//
//        val myAdapter2= NotificationListAdapter(profileList)
//        binding.rvPro2.adapter = myAdapter2
//
//        val myAdapter3= NotificationListAdapter(profileList)
//        binding.rvPro3.adapter = myAdapter3
//
//
//    }
//
//}