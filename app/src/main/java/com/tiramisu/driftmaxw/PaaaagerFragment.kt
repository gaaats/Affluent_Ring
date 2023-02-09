package com.tiramisu.driftmaxw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import com.google.android.material.snackbar.Snackbar
import com.tiramisu.driftmaxw.beeestscooore.JIfjijirf
import com.tiramisu.driftmaxw.beeestscooore.Ijfirjrfijrfjrf
import com.tiramisu.driftmaxw.databinding.FragmentPaaaagerBinding


class PaaaagerFragment : Fragment() {
    private var gtgtt: FragmentPaaaagerBinding? = null
    private val bgbbgbggb get() = gtgtt ?: throw RuntimeException("FragmentPaaaagerBinding = null")

    private val nnhh by lazy {
        Ijfirjrfijrfjrf()
    }



    val listPersons = mutableListOf<JIfjijirf>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgtt = FragmentPaaaagerBinding.inflate(inflater, container, false)
        return bgbbgbggb.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        for (i in 1..50){
            val person = JIfjijirf(nameeee = gtgttg.random())
            listPersons.add(person)
        }

        try {
            initOnItemClickListener()
            addVertAndHorDividers()
            nnhh.submitList(listPersons)
            bgbbgbggb.recyclerViewRaitlist.adapter = nnhh
            bgbbgbggb.btnImgExitRaitFragment.setOnClickListener {
                requireActivity().onBackPressed()
            }
            bgbbgbggb.btnGoUnderstand.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            eeeerrrror()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        gtgtt = null
        super.onDestroy()
    }

    private fun eeeerrrror() {
        Snackbar.make(
            bgbbgbggb.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun addVertAndHorDividers() {
        bgbbgbggb.recyclerViewRaitlist.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun initOnItemClickListener() {
        nnhh.setOnItemClickListener {
            Snackbar.make(
                bgbbgbggb.root,
                "My name is ${it.nameeee}",
                Snackbar.LENGTH_LONG
            ).show()

        }
    }

    val gtgttg = listOf(
        "William",
        "James",
        "Robert",
        "John",
        "David",
        "Elizabeth",
        "Richard",
        "Barbara",
        "Susan",
        "Joseph",
        "Jessica",
        "Thomas",
        "Sarah",
        "Karen",
        "Lisa",
        "Charles",
        "Christopher",
        "Daniel",
        "Nancy",
        "Betty",
        "Matthew"
    )
}