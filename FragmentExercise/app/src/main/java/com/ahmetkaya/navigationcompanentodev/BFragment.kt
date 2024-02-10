package com.ahmetkaya.navigationcompanentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetkaya.navigationcompanentodev.databinding.FragmentBBinding

class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonGidisY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSayfaY)
        }

        return view
    }


}