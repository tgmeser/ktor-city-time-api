package com.babyapps.plugins

import com.babyapps.routes.listCities
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {


    routing {

        // Şehir bilgilerini içeren listeyi göster
        listCities()

        // static("/static") {
        // 'static' remotePath değerini kaldırıldı. IpV4 üzerindeki adresten erişim yapılacak
        // Çünkü localhost üzerinden getirilirse Emulatorde çalışmıyor

        static {
            resources("static")
        }
    }
}
