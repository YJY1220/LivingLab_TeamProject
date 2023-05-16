package com.guri.loginkt_new.Fragments

<<<<<<< Updated upstream
=======
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
>>>>>>> Stashed changes
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
<<<<<<< Updated upstream
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
=======
import android.widget.TextView
import android.widget.TimePicker
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.guri.loginkt_new.R
import com.guri.loginkt_new.databinding.FragmentContributionBinding
import com.guri.loginkt_new.databinding.FragmentTodoBinding
import com.guri.loginkt_new.recyclerView.ListHorizontal
import com.guri.loginkt_new.recyclerView.ListHorizontalAdapter
import com.guri.loginkt_new.recyclerView.ListVertical
import com.guri.loginkt_new.recyclerView.ListVerticalAdapter
import kotlin.math.min

class contributionFragment: BottomSheetDialogFragment() {
>>>>>>> Stashed changes

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var listAdapter: ListAdapter

<<<<<<< Updated upstream
        private var _binding: FragmentContributionBinding? = null
=======
    private var _binding: FragmentContributionBinding? = null

>>>>>>> Stashed changes
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

<<<<<<< Updated upstream
=======
    val verList = arrayListOf(
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
        ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시")
    )

    private var calendar = Calendar.getInstance()
    private var year = calendar.get(Calendar.YEAR)
    private var month = calendar.get(Calendar.MONTH)
    private var day = calendar.get(Calendar.DAY_OF_MONTH)

    private var hour = calendar.get(Calendar.HOUR)
    private var minute = calendar.get(Calendar.MINUTE)


>>>>>>> Stashed changes
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContributionBinding.inflate(inflater, container, false)
        val view = binding.root
<<<<<<< Updated upstream
        return view
    }

=======


        binding.btnAdd.setOnClickListener {
            val bottomSheetView = layoutInflater.inflate(R.layout.fragment_todo, null)
            val bottomSheetDialog = BottomSheetDialog(requireContext())
            bottomSheetDialog.behavior.state = BottomSheetBehavior.STATE_COLLAPSED
            bottomSheetDialog.setContentView(bottomSheetView)

            bottomSheetView.findViewById<View>(com.guri.loginkt_new.R.id.btn_todo_date).setOnClickListener {
                bottomSheetView.findViewById<View>(R.id.btn_todo_date).setOnClickListener {
                    val datePickerDialog =
                        DatePickerDialog(requireContext(), { _, year, month, day ->
                            val date_ =
                                year.toString() + "/" + (month + 1).toString() + "/" + day.toString()

                            bottomSheetView.findViewById<TextView>(R.id.tv_af_todo_duedate).setText(date_)
                        }, year, month, day)
                    datePickerDialog.show()
                }
                bottomSheetView.findViewById<View>(R.id.btn_todo_time).setOnClickListener {
                    val timePickerDialog =

                        TimePickerDialog(requireContext(), { _, hour, minute ->
                            if (hour>12) {
                                val newhour = hour-12
                                val pm = "오후 " + newhour.toString() + "시 " + minute.toString() + "분"
                                bottomSheetView.findViewById<TextView>(R.id.tv_af_todo_duetime).setText(pm)
                            }
                            else {
                                val am = "오전 " + hour.toString() + "시 " + minute.toString() + "분"
                                bottomSheetView.findViewById<TextView>(R.id.tv_af_todo_duetime).setText(am)
                            }

                        }, hour, minute, false)
                   timePickerDialog.show()
                }
            }

            bottomSheetView.findViewById<View>(R.id.btn_add2).setOnClickListener {

                bottomSheetDialog.dismiss()
            }

            // bottomSheetDialog의 dismiss 버튼 선택시 dialog disappear

            // bottomSheetDialog 뷰 생성
            bottomSheetDialog.setContentView(bottomSheetView)

            bottomSheetDialog.show()

        }

        return view
    }


>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
        val verList = arrayListOf(
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시"),
            ListVertical("피그마 제작하기", "제목 화면, 일정 기능 구현","6월 19일 9시")
        )
=======

>>>>>>> Stashed changes

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