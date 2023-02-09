package com.tiramisu.driftmaxw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tiramisu.driftmaxw.databinding.FragmentGaaam1Binding


class Gaaam1Fragment : Fragment() {
    private var fragmentGaaam1Binding: FragmentGaaam1Binding? = null
    private val binding
        get() = fragmentGaaam1Binding ?: throw RuntimeException("FragmentGaaam1Binding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaam1Binding = FragmentGaaam1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.leeeftDovn.setOnClickListener {
                findNavController().navigate(R.id.action_gaaam1Fragment_to_diifffaFragment)
            }
            binding.leeeftTop.setOnClickListener {
                findNavController().navigate(R.id.action_gaaam1Fragment_to_diifffaFragment)
            }
            binding.rightTop.setOnClickListener {
                findNavController().navigate(R.id.action_gaaam1Fragment_to_diifffaFragment)
            }
            binding.rightDovnp.setOnClickListener {
                findNavController().navigate(R.id.action_gaaam1Fragment_to_diifffaFragment)
            }

            binding.leaderrrs.setOnClickListener {
                findNavController().navigate(R.id.action_gaaam1Fragment_to_paaaagerFragment)
            }




        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }




    override fun onDestroy() {
        fragmentGaaam1Binding = null
        super.onDestroy()
    }
}