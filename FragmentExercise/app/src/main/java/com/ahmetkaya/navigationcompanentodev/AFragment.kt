package com.ahmetkaya.navigationcompanentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetkaya.navigationcompanentodev.databinding.FragmentABinding

class AFragment : Fragment() {
    private lateinit var binding : FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonGidisB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisSayfaB)
        }

        return view
    }

}