package com.github.hfantin.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform