package com.example.studentdetails.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.studentdetails.R
import kotlinx.android.synthetic.main.fragment_select_data_passing.*

class SelectDataPassingFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_data_passing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val studentId = arguments?.getString("id")
        val studentName = arguments?.getString("name")
        val studentDepartment = arguments?.getString("dept")
        val studentCurrentYear = arguments?.getString("year")

        bundleButton.setOnClickListener {
            val bundle = bundleOf(
                "id" to studentId ,
                "name" to studentName ,
                "dept" to studentDepartment ,
                "year" to studentCurrentYear
            )
            findNavController().navigate(R.id.action_selectDataPassingFragment_to_viewDetailsFragmentUsingBundle , bundle)
        }

        safeArgsButton.setOnClickListener {
            findNavController().navigate(SelectDataPassingFragmentDirections
                .actionSelectDataPassingFragmentToViewDetailsFragmentUsingSafeArgs(
                studentId!! ,
                studentName!! ,
                studentDepartment!! ,
                studentCurrentYear!!
            ))
        }
    }
}