package com.tiramisu.driftmaxw.gtmtgkngtktgngt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tiramisu.driftmaxw.R
import com.tiramisu.driftmaxw.databinding.FragmentDiifffaBinding


class DiifffaFragment : Fragment() {
    private var fragmentDiifffaBinding: FragmentDiifffaBinding? = null
    private val binding
        get() = fragmentDiifffaBinding ?: throw RuntimeException("FragmentDiifffaBinding = null")


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
        fragmentDiifffaBinding = FragmentDiifffaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.eeeasy.setOnClickListener {
                val imageView = it as Button
                val text = imageView.text.toString()
                Toast.makeText(requireContext(), "You take ${text} level", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_diifffaFragment_to_gaaaaaaame3Fragment)
            }
            binding.notEasy.setOnClickListener {
                val imageView = it as Button
                val text = imageView.text.toString()
                Toast.makeText(requireContext(), "You take ${text} level", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_diifffaFragment_to_gaaaaaaame3Fragment)
            }
            binding.hard.setOnClickListener {
                val imageView = it as Button
                val text = imageView.text.toString()
                Toast.makeText(requireContext(), "You take ${text} level", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_diifffaFragment_to_gaaaaaaame3Fragment)
            }
            binding.normal.setOnClickListener {
                val imageView = it as Button
                val text = imageView.text.toString()
                Toast.makeText(requireContext(), "You take ${text} level", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_diifffaFragment_to_gaaaaaaame3Fragment)
            }
            binding.extraHard.setOnClickListener {
                val imageView = it as Button
                val text = imageView.text.toString()
                Toast.makeText(requireContext(), "You take ${text} level", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_diifffaFragment_to_gaaaaaaame3Fragment)
            }





        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }




    override fun onDestroy() {
        fragmentDiifffaBinding = null
        super.onDestroy()
    }
}