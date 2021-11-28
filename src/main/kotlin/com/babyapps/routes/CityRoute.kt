package com.babyapps.routes

import com.babyapps.data.model.City
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

const val BASE_URL = "http://192.168.1.5:8080"

private val cities = listOf(
    City(1,"London", "ukRed", "#f24d4d", "+2"),
    City(2,"Paris", "frPurple", "#6b62c7", "+4"),
    City(3,"Rome", "romanRed", "#a90000", "+8"),
    City(4,"NYC", "nycSky", "#407294", "+9"),
    City(5,"Sydney", "auOrange", "#ffae51", "+10"),
    City(6,"Moscow", "ruGray", "#4e5c71", "+7"),
    City(7,"Kairo", "egYellow", "#ffdc51", "+8"),
    City(8,"Tokyo", "jpBlack", "#00161e", "+15"),
    City(9,"Sao Paulo", "brBlue", "#b0e0e6", "+5"),
    City(10,"Montreal", "caPink", "#ffc0cb", "+1"),
)

fun Route.listCities() {
    get("/cities") {
        call.respond(
            HttpStatusCode.OK,
            cities
        )
    }
}