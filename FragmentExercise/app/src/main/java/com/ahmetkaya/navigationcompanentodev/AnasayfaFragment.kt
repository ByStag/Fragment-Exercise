package com.ahmetkaya.navigationcompanentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetkaya.navigationcompanentodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonGidisA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSayfaA)
        }

        binding.buttonGidisX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSayfaX)
        }

        return view
    }


}