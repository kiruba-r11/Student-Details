package com.example.studentdetails.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.studentdetails.R
import kotlinx.android.synthetic.main.fragment_view_details.*

class ViewDetailsFragmentUsingBundle : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val studentId = arguments?.getString("id")
        val studentName = arguments?.getString("name")
        val studentDepartment = arguments?.getString("dept")
        val studentCurrentYear = arguments?.getString("year")

        setStudentIdTV.text = studentId
        setStudentNameTV.text = studentName
        setStudentDepartmentTV.text = studentDepartment
        setStudentCurrentYearTV.text = studentCurrentYear
    }
}