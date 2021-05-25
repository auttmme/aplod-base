package com.lawstech.aplod.ui.about_us

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lawstech.aplod.R
import com.lawstech.aplod.databinding.FragmentAboutUsBinding

class AboutUsFragment : Fragment() {

//    private lateinit var aboutUsViewModel: AboutUsViewModel
    private lateinit var fragmentAboutUsBinding: FragmentAboutUsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentAboutUsBinding = FragmentAboutUsBinding.inflate(layoutInflater, container, false)
        return fragmentAboutUsBinding.root
    }
}