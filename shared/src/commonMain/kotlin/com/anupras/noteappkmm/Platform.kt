package com.anupras.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform