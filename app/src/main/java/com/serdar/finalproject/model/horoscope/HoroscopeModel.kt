package com.serdar.finalproject.model.horoscope


data class HoroscopeModel(
    var date_range: String,
    var current_date: String,
    var description: String,
    var compatibility: String,
    var mood: String,
    var color: String,
    var lucky_number: String,
    var lucky_time: String,


    )