package com.tiramisu.driftmaxw.gugthgthugt

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class KIjfrijrfjfrjrf(ihjyjhyhyijhyjihy: Application): ViewModel() {

    val ngtjngtjgtnngtngt = ihjyjhyhyijhyjihy.packageManager
    fun gjitgijgtjigtjgtji(gtgtbgth: WebView): WebSettings{
       val gthgtgthgthgt = gtgtbgth.settings
        gthgtgthgthgt.javaScriptEnabled = true
        gthgtgthgthgt.useWideViewPort = true
        gthgtgthgthgt.loadWithOverviewMode = true
        gthgtgthgthgt.allowFileAccess = true
        gthgtgthgthgt.domStorageEnabled = true
        gthgtgthgthgt.userAgentString = gthgtgthgthgt.userAgentString.replace("; wv", "")
        gthgtgthgthgt.javaScriptCanOpenWindowsAutomatically = true
        gthgtgthgthgt.setSupportMultipleWindows(false)
        gthgtgthgthgt.displayZoomControls = false
        gthgtgthgthgt.builtInZoomControls = true
        gthgtgthgthgt.allowFileAccess = true
        gthgtgthgthgt.allowContentAccess = true
        gthgtgthgthgt.setSupportZoom(true)
        gthgtgthgthgt.pluginState = WebSettings.PluginState.ON
        gthgtgthgthgt.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gthgtgthgthgt.cacheMode = WebSettings.LOAD_DEFAULT
        gthgtgthgthgt.allowContentAccess = true
        gthgtgthgthgt.mediaPlaybackRequiresUserGesture = false
        return gthgtgthgthgt
    }
    fun gjtigtjjgtijgti(gtbgtbgthbgt: String) {
        OneSignal.setExternalUserId(
            gtbgtbgthbgt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtbhgtbgthbgt = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtbhgtbgthbgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val bvrfgygfrgfr =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bvrfgygfrgfr"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gtgthgtgthugt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gtgthgtgthugt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtjigtjjigtjigt(vfbhfggrfrfgyrf: String): Boolean {
        try {
            ngtjngtjgtnngtngt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}