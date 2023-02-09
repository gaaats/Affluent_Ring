package com.tiramisu.driftmaxw.gtmtgkngtktgngt

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tiramisu.driftmaxw.R
import com.tiramisu.driftmaxw.hgithgtugt.HIUFhrhrfhrfhfrhrf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class FiiiirststtFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthtigthgthugt=context
    }

    private lateinit var gthtigthgthugt: Context

    val rfrfgfrgurfgugrfgf by activityViewModel<HIUFhrhrfhrfhfrhrf>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiirststt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rfrfgfrgurfgugrfgf.vfbvfbfrgrfyggrf(gthtigthgthugt)

        findNavController().navigate(R.id.action_fiiiirststtFragment_to_cooontrrrryyFragment)

    }
}