package de.meister.speechrecognition.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import de.meister.speechrecognition.R
import de.meister.speechrecognition.databinding.MainFragmentBinding

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels<MainViewModel>()
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater, container, false)

        binding.switchTurnOnSpeech.setOnCheckedChangeListener { buttonView, isChecked ->  }

        return binding.root
    }

    private fun onCheckedChanged(isChecked: Boolean) {
        viewModel.switchIsChecked.value = isChecked
    }
}