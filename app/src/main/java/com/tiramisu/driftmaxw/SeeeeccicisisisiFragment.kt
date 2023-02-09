package com.tiramisu.driftmaxw

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hyjiohyjoihy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hykphyjgjigt
import com.tiramisu.driftmaxw.hgithgtugt.HIUFhrhrfhrfhfrhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeeccicisisisiFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_seeeeccicisisisi, container, false)
    }

    val gtgthugthgtgt by activityViewModel<HIUFhrhrfhrfhfrhrf>(named("MainModel"))
    lateinit var gtgtihgthgthugt: String
    lateinit var gthutghgthugt: String
    lateinit var gtgthgthugtu: String
    private lateinit var gtgthhg: Context

    val gthgthgthug: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgthhg = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gtgthugthgtgt.hyhyjuujujkik.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                gthgthgthug.edit().putString("mainId", main).apply()
            }
        }

        gtgthugthgtgt.bgvfffrrfrf.observe(viewLifecycleOwner) {
            if (it != null) {

                gtgtihgthgthugt = it.bghyhyhyhy
                gtgthgthugtu = it.bggthhyhyhy
                gthutghgthugt = it.vhjukiikkiew

                gthgthgthug.edit().putString(hyjiohyjoihy, gtgtihgthgthugt).apply()
                gthgthgthug.edit().putString(JIFirfuhhrfrfuh.juikikikhy, gtgthgthugtu).apply()
                gthgthgthug.edit().putString(hykphyjgjigt, gthutghgthugt).apply()

                rfhrfrfhurfhurfhufr()
            }
        }
    }

    private fun rfhrfrfhurfhurfhufr() {
        findNavController().navigate(R.id.action_seeeeccicisisisiFragment_to_preeeFiiiillllaFragment)
    }
}