package com.tiramisu.driftmaxw.fbrbfrrfyrfgrf

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hjyjohy
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hyjohfrg
import com.tiramisu.driftmaxw.gugthgthugt.hyhyjuujujujkiikikhhggf
import com.tiramisu.driftmaxw.gugthgthugt.vfvfbgbgtggthyhyhy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class KokokokokokClasss:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(hgithigthgthugt)


        val gtgtihgthgthgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val hgjiojihyj = getSharedPreferences("PREFS_NAME", 0)

        val hyjihyjihyji = MyTracker.getTrackerParams()
        val cdvgfde = MyTracker.getTrackerConfig()
        val oo = MyTracker.getInstanceId(this)
        cdvgfde.isTrackingLaunchEnabled = true
        val hyihyjhyi = UUID.randomUUID().toString()

        if (hgjiojihyj.getBoolean("my_first_time", true)) {
            hyjihyjihyji.setCustomUserId(hyihyjhyi)
            gtgtihgthgthgt.edit().putString(hjyjohy, hyihyjhyi).apply()
            gtgtihgthgthgt.edit().putString(hyjohfrg, oo).apply()
            hgjiojihyj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDIN = gtgtihgthgthgt.getString(hjyjohy, hyihyjhyi)
            hyjihyjihyji.setCustomUserId(shIDIN)
        }
        MyTracker.initTracker(vfbrfgygrfyrf, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@KokokokokokClasss)
            modules(
                listOf(
                    vfvfbgbgtggthyhyhy, hyhyjuujujujkiikikhhggf
                )
            )
        }
    }

    companion object{
        const val hgithigthgthugt = "18582586-5bb3-44f9-974c-03e07c1bf635"
        val vfbrfgygrfyrf = "53326615064307186487"
        val hyjiohyjhy = "TFwckNSfigLJXcqNoC8vYo"
        val hihyjjihy = "com.tiramisu.driftmaxw"
    }
}
