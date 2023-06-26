package com.yellu.dsapractice.interview

fun main() {
    val musicPlayer = MusicPlayer()
    musicPlayer.addSong(1, "Sid Sriram", "Sid 1", Genre.FOLK)
    musicPlayer.addSong(2, "Arjit", "Arjit 1", Genre.JAZZ)
    musicPlayer.addSong(3, "MM", "MM 1", Genre.ROCK)
    musicPlayer.addSong(4, "Devi", "Devi 1", Genre.HIPHOP)
    musicPlayer.addSong(5, "Rahet fateh ali khan", "Rahet 1", Genre.POP)

    musicPlayer.playMusicFromQueue()

    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()

    musicPlayer.playSong(3, true)
    musicPlayer.playSong(5, false)

    musicPlayer.playMusicFromQueue()

    musicPlayer.closeMusicPlayer()

    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()
    musicPlayer.playRandomSong()
    musicPlayer.playMusicFromQueue()
}