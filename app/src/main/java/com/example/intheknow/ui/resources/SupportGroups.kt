package com.example.intheknow.ui.resources

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intheknow.R


/**
 * A simple [Fragment] subclass.
 * Use the [SupportGroups.newInstance] factory method to
 * create an instance of this fragment.
 */
class SupportGroups : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_support_groups, container, false)
    }


}