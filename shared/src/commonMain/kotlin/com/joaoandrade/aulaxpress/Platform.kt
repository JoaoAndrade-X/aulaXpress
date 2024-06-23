package com.joaoandrade.aulaxpress

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform