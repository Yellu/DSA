package com.yellu.dsapractice.interview

class Song (
    val songId: Int,
    val songName: String,
    val singer: String,
    val type: Genre
    )

enum class Genre {
    POP,
    HIPHOP,
    JAZZ,
    FOLK,
    ROCK
}