package com.guri.loginkt_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.guri.loginkt_new.Fragments.*
import com.guri.loginkt_new.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {
    // 뷰바인딩 사용하기 위해 추가 (3)
    private lateinit var binding: ActivityNotificationBinding

    val homeF = homeFragment()
    val mapF = mapFragment()
    val calendarF = calendarFragment()
    val contributionF = contributionFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        // binding 사용하기 위해 추가 (4)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // 툴바 관련
//        setSupportActionBar(binding.toolbar)
////         파일 제목 툴바에서 제거
//        supportActionBar?.setDisplayShowTitleEnabled(false)
//        //왼쪽 버튼 사용설정(기본은 뒤로가기)
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//        //왼쪽 버튼 아이콘 변경
//        supportActionBar!!.setHomeAsUpIndicator(R.drawable.arrow_back)
//
//        // 툴바 메뉴 클릭시
//        binding.toolbar.setOnMenuItemClickListener{
//            when(it.itemId) {
////                 mypage 클릭 시
//                R.id.toolbar_mypage -> {
//                    // 마이페이지 화면 home에 넣기
//                    val intent = Intent(this, HomeActivity::class.java)
//                    intent.putExtra("toolbar", "mypage")
//                    startActivity(intent)
//                    true
//                }
//
//                // 알림 클릭 시
//                R.id.toolbar_notification -> {
//                    // 알림 화면 home에 넣기
//                    val intent = Intent(this, HomeActivity::class.java)
//                    intent.putExtra("toolbar", "notification")
//                    startActivity(intent)
//                    true
//                }
//
//                else -> false
//            }
//        }
//
//        // 하단 내비게이션 바 아이콘 클릭하면 다른 화면으로 전환되는 거
//        binding.bottomNavigationView.setOnItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.navi_home -> replaceFragment(homeF)
//                R.id.navi_calendar -> replaceFragment(calendarF)
//                R.id.navi_contribution -> replaceFragment(contributionF)
//                R.id.navi_map -> replaceFragment(mapF)
//            }
//            true
//        }

        // 여기부터 알림 목록

        val profileList = arrayListOf(
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00"),
            Notification_list("회의 일정 추가", "5월 17일 15:00 - 18:00")
        )

        // 세로 방향으로 리스트 만들고있으니까 VERTICAL
        binding.rvPro1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvPro1.setHasFixedSize(true)
        binding.rvPro1.adapter = NotificationListAdapter(profileList)


    }

    private fun replaceFragment(fragment : Fragment) {
        Log.d("MainActivity","${fragment}")
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragmentCotainer,fragment)
                commit()
            }
    }

    // 툴바에 아이콘 나타나게
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }
}