package com.ahmetkaya.navigationcompanentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetkaya.navigationcompanentodev.databinding.FragmentXBinding

class XFragment : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentXBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonGidisY1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSayfaXY)
        }

        return view
    }


}