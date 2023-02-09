package com.tiramisu.driftmaxw.hgithgtugt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.tiramisu.driftmaxw.fbrbfrrfyrfgrf.KokokokokokClasss.Companion.hyjiohyjhy
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.Iirifrhh
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.Ftgjugtuihgtgt
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.frhirfhfrhurf.HIFUhhfrhrfh
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.gthbgbgtbhgt.BHbfrfgryrfg
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class HIUFhrhrfhrfhfrhrf(
    private val gthtghugt: Iirifrhh,
    private val juujkiikik: Ftgjugtuihgtgt,
    private val vfvfgtgtgtgt: SharedPreferences,
    val vffveddeed: Application
) : ViewModel() {

    init {
        gthgtgtgthgtugtu()
    }

    private fun gthgtgtgthgtugtu() {
        viewModelScope.launch(Dispatchers.IO) {
            ggtihgthhgt()
        }
        vfhfvbvfbbvfbvfbhvf()
    }

    private fun vfhfvbvfbbvfbvfbhvf() {
        viewModelScope.launch(Dispatchers.Main) {
            gthgthgtuigthgt()
        }
    }

    private val vfbfhvbvfbhvfb = MutableLiveData<HIFUhhfrhrfh>()
    val hyhujujjuuj: LiveData<HIFUhhfrhrfh>
        get() = vfbfhvbvfbhvfb

    private val hjujujujuj = MutableLiveData<BHbfrfgryrfg>()
    val bgvfffrrfrf: LiveData<BHbfrfgryrfg>
        get() = hjujujujuj

    private val gthyhyhy = MutableLiveData<String>()
    val vffvfcfc: LiveData<String>
        get() = gthyhyhy

    private val vbggbgtgtfrrfrf = MutableLiveData<String?>()
    val hyhyjuujujkik: LiveData<String?>
        get() = vbggbgtgtfrrfrf


    suspend fun gthgthgtuigthgt() {
        vfbfhvbvfbhvfb.postValue(gthtghugt.hyhujujujuj().body())
        vfbrfgyrfgfrgrfygfry()
    }

    suspend fun vfbrfgyrfgfrgrfygfry() {
        hjujujujuj.postValue(juujkiikik.bghyjuju().body())
    }

    fun gttghuigtiugt(vfbjbfrgurfgrfrf: Context) {
        AppsFlyerLib.getInstance()
            .init(hyjiohyjhy, vfvfbvfbjvfbrfygrfgy, vffveddeed)
        AppsFlyerLib.getInstance().start(vfbjbfrgurfgrfrf)
    }

    fun vfbvfbfrgrfyggrf(vfbfvbfvbvfhvf: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            vfbfvbfvbvfhvf
        ) { data: AppLinkData? ->
            data?.let {
                val gtjtggthgtiuh = data.targetUri?.host.toString()
                vfvfgtgtgtgt.edit().putString("deepSt", gtjtggthgtiuh).apply()
            }
        }
    }

    private val vfvfbvfbjvfbrfygrfgy = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val vfbrfgfrugrf = data?.get("campaign").toString()
            gthyhyhy.postValue(vfbrfgfrugrf)

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun ggtihgthhgt() {
        val vfbhrfrfggrfgrf = AdvertisingIdClient(vffveddeed)
        vfbhrfrfggrfgrf.start()
        val gtngtgthyjhyjihyjihy = vfbhrfrfggrfgrf.info.id.toString()
        vbggbgtgtfrrfrf.postValue(gtngtgthyjhyjihyjihy)
    }

}