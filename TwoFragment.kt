package com.example.demofragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.demofragment.IBackInterface
import com.example.demofragment.R
import kotlinx.android.synthetic.main.fragment_two.*

class TwoFragment : Fragment() {

    private lateinit var backInterface : IBackInterface
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        backInterface = activity as IBackInterface
        backInterface.setSelectedFragment(this)
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        back.setOnClickListener { requireView().findNavController().navigateUp() }
    }

    fun onBackPressed(): Boolean{
        return true
    }
}