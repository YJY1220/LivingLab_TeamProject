package com.guri.loginkt_new.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guri.loginkt_new.R
import com.guri.loginkt_new.recyclerView.ListHorizontalAdapter
import com.guri.loginkt_new.recyclerView.ListHorizontal
import com.guri.loginkt_new.databinding.FragmentContributionBinding
import com.guri.loginkt_new.recyclerView.ListVertical
import com.guri.loginkt_new.recyclerView.ListVerticalAdapter

class contributionFragment: Fragment() {

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var listAdapter: ListAdapter

        private var _binding: FragmentContributionBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContributionBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val horList = arrayListOf(
            ListHorizontal("12%"),
            ListHorizontal("24%"),
            ListHorizontal("48%"),
            ListHorizontal("96%"),
            ListHorizontal("24%"),
            ListHorizontal("50%")
        )

        val verList = arrayListOf(
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시")
        )

        binding.recyclerHorizon.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        binding.recyclerHorizon.setHasFixedSize(true)
        // RecyclerView.adapter에 지정
        binding.recyclerHorizon.adapter = ListHorizontalAdapter(horList)

        binding.recyclerVertical.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        binding.recyclerVertical.setHasFixedSize(true)
        // RecyclerView.adapter에 지정
        binding.recyclerVertical.adapter = ListVerticalAdapter(verList)
    }
}