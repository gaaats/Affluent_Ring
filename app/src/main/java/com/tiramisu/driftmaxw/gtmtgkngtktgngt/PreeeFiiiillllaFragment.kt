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
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.juikikikhy
import com.tiramisu.driftmaxw.hgithgtugt.HIUFhrhrfhrfhfrhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PreeeFiiiillllaFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_preee_fiiiilllla, container, false)
    }

    val gthutghugthu by activityViewModel<HIUFhrhrfhrfhfrhrf>(named("MainModel"))
    val gntgttgbgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gthtghgtgt: String
    private lateinit var rbrfrfgrfgrffr: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        rbrfrfgrfgrffr = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fhrfgfrrfgyfrgyrfg = gntgttgbgtgt.getString(juikikikhy, null)
        val frgrfgufrgyrf = gntgttgbgtgt.getString("appCamp", null)

        if (fhrfgfrrfgyfrgyrfg=="1" &&frgrfgufrgyrf == null) {
            gthutghugthu.gttghuigtiugt(rbrfrfgrfgrffr)
            gthutghugthu.vffvfcfc.observe(viewLifecycleOwner) {
                if (it != null) {
                    gthtghgtgt = it.toString()
                    gntgttgbgtgt.edit().putString("appCamp", gthtghgtgt).apply()
                    fhufrhrfhrfrfufrhfrhfr()
                }
            }
        } else {
            fhufrhrfhrfrfufrhfrhfr()
        }
    }

    private fun fhufrhrfhrfrfufrhfrhfr() {
        findNavController().navigate(R.id.action_preeeFiiiillllaFragment_to_fillllllllllliiiitrrrrerFragment)
    }

}