package com.lawstech.aplod.ui.member

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lawstech.aplod.databinding.FragmentAboutUsBinding
import com.lawstech.aplod.utils.DataDummy
import com.lawstech.aplod.viewmodel.ViewModelFactory

class MemberFragment : Fragment() {

    private lateinit var fragmentAboutUsBinding: FragmentAboutUsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        fragmentAboutUsBinding = FragmentAboutUsBinding.inflate(layoutInflater, container, false)
        return fragmentAboutUsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val members = DataDummy.generateDummyMembers()

            val memberAdapter = MemberAdapter()
            memberAdapter.setMember(members)

            with(fragmentAboutUsBinding.rvMember) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = memberAdapter
            }
        }
    }
}