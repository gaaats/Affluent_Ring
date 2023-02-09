package com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf

import com.tiramisu.driftmaxw.gjttgjgtgtjitgjt.JIFirfuhhrfrfuh.urrfhhfrhrf
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.frhirfhfrhurf.HIFUhhfrhrfh
import com.tiramisu.driftmaxw.gugthgthugt.frufrrfhrfhhurf.gthbgbgtbhgt.BHbfrfgryrfg
import retrofit2.Response
import retrofit2.http.GET

interface Jfhriuhfrhrf {
    @GET(urrfhhfrhrf)
    suspend fun hyhyjuujujuj(): Response<HIFUhhfrhrfh>
}

interface HIUfhrhrfhurf {
    @GET("lola.json")
    suspend fun hyjuujikikik(): Response<BHbfrfgryrfg>
}

class Iirifrhh(private val hyjuujkikiikikik: Jfhriuhfrhrf) {
    suspend fun hyhujujujuj() = hyjuujkikiikikik.hyhyjuujujuj()
}
class Ftgjugtuihgtgt(private val hyjuujhygtfrfr: HIUfhrhrfhurf) {
    suspend fun bghyjuju() = hyjuujhygtfrfr.hyjuujikikik()
}




