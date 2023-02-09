package com.tiramisu.driftmaxw.gugthgthugt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.Jfhriuhfrhrf
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.Iirifrhh
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.Ftgjugtuihgtgt
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.HIUfhrhrfhurf
import com.tiramisu.driftmaxw.hgithgtugt.HIUFhrhrfhrfhfrhrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


fun ghyujunnhnnhhbbb(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hyjuujujujuj(): Gson {
    return GsonBuilder().create()
}

val vfvfbgbgtggthyhyhy = module {
    viewModel (named("MainModel")){
        HIUFhrhrfhrfhfrhrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        KIjfrijrfjfrjrf(get())
    }
}

val hyhyjuujujujkiikikhhggf = module {

    single  <HIUfhrhrfhurf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HIUfhrhrfhurf::class.java)
    }

    single <Jfhriuhfrhrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Jfhriuhfrhrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://affluentring.space/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Iirifrhh(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Ftgjugtuihgtgt(get(named("HostInter")))
    }
    single{
        hyjuujujujuj()
    }
    single (named("SharedPreferences")) {
        ghyujunnhnnhhbbb(androidApplication())
    }
}

