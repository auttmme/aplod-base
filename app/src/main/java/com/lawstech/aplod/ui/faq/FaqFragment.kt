package com.lawstech.aplod.ui.faq

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lawstech.aplod.R
import com.lawstech.aplod.databinding.FragmentFaqBinding

class FaqFragment : Fragment() {

//    private lateinit var faqViewModel: FaqViewModel
    private lateinit var fragmentFaqBinding: FragmentFaqBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFaqBinding = FragmentFaqBinding.inflate(layoutInflater, container, false)
        return fragmentFaqBinding.root
    }
}