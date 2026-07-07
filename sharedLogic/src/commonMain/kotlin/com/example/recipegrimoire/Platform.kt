package com.example.recipegrimoire

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform