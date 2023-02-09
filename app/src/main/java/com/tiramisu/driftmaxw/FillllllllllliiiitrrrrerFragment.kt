package com.tiramisu.driftmaxw

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.tiramisu.driftmaxw.fbrbfrrfyrfgrf.KokokokokokClasss.Companion.hihyjjihy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.vbfbrfyfr
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.juikikikhy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gbhugtyugrf
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hyjiohyjoihy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gngtugthgt
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hyjohfrg
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hfrgfdeyfdg
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.ghdged
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hjyjohy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.vfbvfbjgtjhbgt
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gthigtngtngt
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gtgtjogtjo
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.vbfryfrgyfr
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gtjotjogtjogt
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hyjohyjiohy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gtjiotgogtihgt
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hykphyjgjigt
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FillllllllllliiiitrrrrerFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hughgthgthut = bvfbbfrrfggrf.getString(gngtugthgt, null)
        val gthugthutghu = bvfbbfrrfggrf.getString("appCamp", null)
        val gthgthgthugt = bvfbbfrrfggrf.getString("deepSt", null)
        val hyjihyjihyji = bvfbbfrrfggrf.getString(hyjiohyjoihy, null)
        val gtgtgtgt = bvfbbfrrfggrf.getString(juikikikhy, null)
        val rhfrhurfhurfh = bvfbbfrrfggrf.getString(hykphyjgjigt, null)
        val gtjtggtjijtgi = bvfbbfrrfggrf.getString("mainId", null)
        val gtgtdrddr = hihyjjihy
        val buildVers = Build.VERSION.RELEASE
        val gthuggthugt = bvfbbfrrfggrf.getString(hjyjohy, null)
        val fhgigthugt: String? = bvfbbfrrfggrf.getString(hyjohfrg, null)

        val gtgthigtgt = Intent(activity, VevvvevevvvActivity2::class.java)
        val gthgthgthgthgt = Intent(activity, GaaagggaamActivity2::class.java)

        val gthgth = AppsFlyerLib.getInstance().getAppsFlyerUID(gthigtihgthgt)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        bvfbbfrrfggrf.edit().putString(gbhugtyugrf, gthgth).apply()

        val vnvfbfbvfbvfbjvfb = "$rhfrhurfhurfh$gtjotjogtjogt$gthugthutghu&$gthigtngtngt$gthgth&$vbfbrfyfr$gtjtggtjijtgi&$vbfryfrgyfr$gtgtdrddr&$gtgtjogtjo$buildVers&$hyjohyjiohy$vfbvfbjgtjhbgt"
        val gtogthogtiih = "$rhfrhurfhurfh$gthigtngtngt$gthuggthugt&$vbfbrfyfr$fhgigthugt&$vbfryfrgyfr$gtgtdrddr&$gtgtjogtjo$buildVers&$hyjohyjiohy$vfbvfbjgtjhbgt"
        val hghgtgrfrf = "$rhfrhurfhurfh$gtjotjogtjogt$gthgthgthugt&$gthigtngtngt$gthgth&$vbfbrfyfr$gtjtggtjijtgi&$vbfryfrgyfr$gtgtdrddr&$gtgtjogtjo$buildVers&$hyjohyjiohy$gtjiotgogtihgt"
        val gngttggth = "$rhfrhurfhurfh$gtjotjogtjogt$gthgthgthugt&$gthigtngtngt$gthuggthugt&$vbfbrfyfr$fhgigthugt&$vbfryfrgyfr$gtgtdrddr&$gtgtjogtjo$buildVers&$hyjohyjiohy$gtjiotgogtihgt"

        when(gtgtgtgt) {
            "1" ->
                if(gthugthutghu!!.contains(hfrgfdeyfdg)) {
                    bvfbbfrrfggrf.edit().putString(ghdged, vnvfbfbvfbvfbjvfb).apply()
                    bvfbbfrrfggrf.edit().putString("WebInt", "campaign").apply()
                    gihgthihgtgthtgh(gtgthigtgt)
                    gthgttghgtgtgtihgt()
                } else if (gthgthgthugt!=null||hyjihyjihyji!!.contains(hughgthgthut.toString())) {
                    bvfbbfrrfggrf.edit().putString(ghdged, hghgtgrfrf).apply()
                    bvfbbfrrfggrf.edit().putString("WebInt", "deepLink").apply()
                    gihgthihgtgthtgh(gtgthigtgt)
                    gthgttghgtgtgtihgt()
                } else {
                    gihgthihgtgthtgh(gthgthgthgthgt)
                    gthgttghgtgtgtihgt()
                }
            "0" ->
                if(gthgthgthugt!=null) {
                    bvfbbfrrfggrf.edit().putString(ghdged, gngttggth).apply()
                    bvfbbfrrfggrf.edit().putString("WebInt", "deepLinkNOApps").apply()
                    gihgthihgtgthtgh(gtgthigtgt)
                    gthgttghgtgtgtihgt()
                } else if (hyjihyjihyji!!.contains(hughgthgthut.toString())) {
                    bvfbbfrrfggrf.edit().putString(ghdged, gtogthogtiih).apply()
                    bvfbbfrrfggrf.edit().putString("WebInt", "geo").apply()
                    gihgthihgtgthtgh(gtgthigtgt)
                    gthgttghgtgtgtihgt()
                } else {
                    gihgthihgtgthtgh(gthgthgthgthgt)
                    gthgttghgtgtgtihgt()
                }
        }
    }

    private fun gihgthihgtgthtgh(gtgthigtgt: Intent) {
        startActivity(gtgthigtgt)
    }

    private fun gthgttghgtgtgtihgt() {
        activity?.finish()
    }

    private lateinit var gthigtihgthgt: Context
    val bvfbbfrrfggrf: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthigtihgthgt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fillllllllllliiiitrrrrer, container, false)
    }
}
