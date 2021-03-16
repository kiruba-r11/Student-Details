package com.example.studentdetails.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.studentdetails.R
import kotlinx.android.synthetic.main.fragment_view_details_using_safe_args.*

class ViewDetailsFragmentUsingSafeArgs : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_details_using_safe_args, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navArgs: ViewDetailsFragmentUsingSafeArgsArgs by navArgs()

        val studentId = navArgs.id
        val studentName = navArgs.name
        val studentDepartment = navArgs.dept
        val studentCurrentYear = navArgs.year

        setStudentIdTV1.text = studentId
        setStudentNameTV1.text = studentName
        setStudentDepartmentTV1.text = studentDepartment
        setStudentCurrentYearTV1.text = studentCurrentYear
    }
}