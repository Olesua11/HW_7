package com.example.hw_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.bumptech.glide.Glide
import com.example.hw_7.databinding.FragmentTopBinding

class TopFragment : Fragment() {

    private var _binding: FragmentTopBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTopBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(this)
            .load("https://i.pinimg.com/564x/f5/85/56/f585565791b30be5446309f5269f8f1a.jpg")
            .into(binding.imageView)

        binding.textViewTitle.text = "Now playing"
        binding.textViewArtist.text = "TAIK ME DOWN"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
