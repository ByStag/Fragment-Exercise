package com.ahmetkaya.navigationcompanentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetkaya.navigationcompanentodev.databinding.FragmentYBinding

class YFragment : Fragment() {
    private lateinit var binding: FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentYBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonGeriAnasayfa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisAnasayfa)
        }

        return view
    }


}