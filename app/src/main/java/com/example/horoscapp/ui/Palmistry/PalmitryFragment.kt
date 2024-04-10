package com.example.horoscapp.ui.Palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FragmentPalmitryBinding

class PalmitryFragment : Fragment() {
    private var _binding: FragmentPalmitryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmitryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}