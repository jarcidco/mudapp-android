package com.jarcidco.mudapp.ui.house_moving.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jarcidco.mudapp.R

class WhereYouNeedItFragment : Fragment() {

    val TAG: String? = WhereYouNeedItFragment::javaClass.name

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_where_you_need_it, container, false)
    }


}
