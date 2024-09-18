package com.translator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform