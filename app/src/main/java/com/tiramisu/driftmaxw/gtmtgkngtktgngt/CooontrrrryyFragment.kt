package com.tiramisu.driftmaxw.gtmtgkngtktgngt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tiramisu.driftmaxw.R
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gngtugthgt
import com.tiramisu.driftmaxw.hgithgtugt.HIUFhrhrfhrfhfrhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CooontrrrryyFragment : Fragment() {
    private lateinit var gthgthitggt: Context


    val fgrfgrfgrfrfg: SharedPreferences by inject(named("SharedPreferences"))
    val vfbvfbhvfhbvfbhfv by activityViewModel<HIUFhrhrfhrfhfrhrf>(named("MainModel"))

    lateinit var gthugthgthugthugtu: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cooontrrrryy, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthgthitggt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vfbvfbhvfhbvfbhfv.hyhujujjuuj.observe(viewLifecycleOwner) {
            if (it!=null) {
                gthugthgthugthugtu = it.bghyhyhyhy
                fgrfgrfgrfrfg.edit().putString(gngtugthgt, gthugthgthugthugtu).apply()
                rguygrfguggrfgrfg()
            }
        }
    }

    private fun rguygrfguggrfgrfg() {
        findNavController().navigate(R.id.action_cooontrrrryyFragment_to_seeeeccicisisisiFragment)
    }
}