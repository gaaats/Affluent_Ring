package com.tiramisu.driftmaxw

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.tiramisu.driftmaxw.databinding.ActivityVevvvevevvv2Binding
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.gbhugtyugrf
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.ghdged
import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.hjyjohy
import com.tiramisu.driftmaxw.gugthgthugt.KIjfrijrfjfrjrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VevvvevevvvActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ghgthggtgthugt = ActivityVevvvevevvv2Binding.inflate(layoutInflater)
        frbrfbrfhfrbhrf = WebView(this)
        setContentView(frbrfbrfhfrbhrf)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(frbrfbrfhfrbhrf, true)
        gntgtjnngtjgt.gjitgijgtjigtjgtji(frbrfbrfhfrbhrf)

        frbrfbrfhfrbhrf.webViewClient = Hffuhrffrhrfhufr()
        frbrfbrfhfrbhrf.webChromeClient = Jfrrfhrfihrfhfr()
        frbrfbrfhfrbhrf.loadUrl(frnkfrnfrnfrn())
    }

    private lateinit var ghgthggtgthugt: ActivityVevvvevevvv2Binding
    lateinit var frbrfbrfhfrbhrf: WebView
    private var hyujujjukiik: ValueCallback<Array<Uri>>? = null
    private var hyhynmmjjuikki: String? = null
    private  val hyhyujujikik = 1

    private val gntgtjnngtjgt by viewModel<KIjfrijrfjfrjrf>(
        named("BeamModel")
    )

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != hyhyujujikik || hyujujjukiik == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var ggthyhyyhhyhy: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (hyhynmmjjuikki != null) {
                    ggthyhyyhhyhy = arrayOf(Uri.parse(hyhynmmjjuikki))
                }
            } else {
                val vfbgbghyhyhyhy = data.dataString
                if (vfbgbghyhyhyhy != null) {
                    ggthyhyyhhyhy = arrayOf(Uri.parse(vfbgbghyhyhyhy))
                }
            }
        }
        hyujujjukiik!!.onReceiveValue(ggthyhyyhhyhy)
        hyujujjukiik = null
        return
    }

    inner class Hffuhrffrhrfhufr: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gntgtjnngtjgt.gtjigtjjigtjigt(url)) {

                    val gthtgihgthgth = Intent(Intent.ACTION_VIEW)
                    gthtgihgthgth.data = Uri.parse(url)
                    startActivity(gthtgihgthgth)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            fvvfbbvfuirfihfrhfr(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VevvvevevvvActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class Jfrrfhrfihrfhfr : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            hyujujjukiik?.onReceiveValue(null)
            hyujujjukiik = filePath
            var gtntgnjgtngtgt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gtntgnjgtngtgt!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = gtjgtjgtgtjgti()
                    gtntgnjgtngtgt.putExtra("PhotoPath", hyhynmmjjuikki)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    hyhynmmjjuikki = "file:" + photoFile.absolutePath
                    gtntgnjgtngtgt.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    gtntgnjgtngtgt = null
                }
            }
            val gthtghgthutgu = Intent(Intent.ACTION_GET_CONTENT)
            gthtghgthutgu.addCategory(Intent.CATEGORY_OPENABLE)
            gthtghgthutgu.type = "image/*"
            val vfbfvbfrgrfggrf: Array<Intent?> = gtntgnjgtngtgt?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val ngngtgtgtngt = Intent(Intent.ACTION_CHOOSER)
            ngngtgtgtngt.putExtra(Intent.EXTRA_INTENT, gthtghgthutgu)
            ngngtgtgtngt.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            ngngtgtgtngt.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfbfvbfrgrfggrf)
            startActivityForResult(ngngtgtgtngt, hyhyujujikik)
            return true
        }

        fun gtjgtjgtgtjgti(): File? {
            val vfbvfbfrgrfgrf = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val hyujujujkiik = "JPEG_" + vfbvfbfrgrfgrf + "_"
            val bgghyhyjujuuj = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                hyujujujkiik,
                ".jpg",
                bgghyhyjujuuj
            )
        }
    }

    private fun frnkfrnfrnfrn(): String {

        val nvfrfrfguyrfguggrf = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val vfbvfjvfbvfbvfb = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val vfbbgededfedfed = vfbvfjvfbvfbvfb.getString(ghdged, null)
        Log.d("lolo", vfbbgededfedfed.toString())
        val hyhyjuujujujju = vfbvfjvfbvfbvfb.getString(hjyjohy, null)
        val hyhyjuujjuju = vfbvfjvfbvfbvfb.getString(gbhugtyugrf, null)


        when (vfbvfjvfbvfbvfb.getString("WebInt", null)) {
            "campaign" -> {
                gntgtjnngtjgt.gjtigtjjgtijgti(hyhyjuujjuju.toString())
            }
            "deepLink" -> {
                gntgtjnngtjgt.gjtigtjjgtijgti(hyhyjuujjuju.toString())
            }
            "deepLinkNOApps" -> {
                gntgtjnngtjgt.gjtigtjjgtijgti(hyhyjuujujujju.toString())
            }
            "geo" -> {
                gntgtjnngtjgt.gjtigtjjgtijgti(hyhyjuujujujju.toString())
            }
        }
        Toast.makeText(this, "${vfbbgededfedfed}",Toast.LENGTH_LONG).show()
        return nvfrfrfguyrfguggrf.getString("SAVED_URL", vfbbgededfedfed).toString()
    }

    var gtgtgthyhy = ""
    fun fvvfbbvfuirfihfrhfr(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (gtgtgthyhy == "") {
                gtgtgthyhy = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val hyhygtrffvvg = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val bgbghyhyjujuikik = hyhygtrffvvg.edit()
                bgbghyhyjujuikik.putString("SAVED_URL", lurlurlurlurlur)
                bgbghyhyjujuikik.apply()
            }
        }
    }
    private var gtghyhyjuujg = false
    override fun onBackPressed() {

        if (frbrfbrfhfrbhrf.canGoBack()) {
            if (gtghyhyjuujg) {
                frbrfbrfhfrbhrf.stopLoading()
                frbrfbrfhfrbhrf.loadUrl(gtgtgthyhy)
            }
            this.gtghyhyjuujg = true
            frbrfbrfhfrbhrf.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                gtghyhyjuujg = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}
