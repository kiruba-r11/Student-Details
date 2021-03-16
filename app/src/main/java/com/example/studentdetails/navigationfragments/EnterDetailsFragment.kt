package com.example.studentdetails.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.studentdetails.R
import kotlinx.android.synthetic.main.fragment_enter_details.*

class EnterDetailsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nextButton.setOnClickListener {
            val studentId = studentId.text.toString()
            val studentName = studentName.text.toString()
            val studentDepartment = studentDepartment.text.toString()
            val studentCurrentYear = studentCurrentYear.text.toString()

            if(studentId.isEmpty() || studentName.isEmpty() || studentDepartment.isEmpty() || studentCurrentYear.isEmpty())
                Toast.makeText(context, "Enter valid input", Toast.LENGTH_SHORT).show()
            else {

                val bundle = bundleOf(
                    "id" to studentId ,
                    "name" to studentName ,
                    "dept" to studentDepartment ,
                    "year" to studentCurrentYear
                )
                findNavController().navigate(R.id.action_enterDetailsFragment_to_selectDataPassingFragment , bundle)
            }
        }
    }
}