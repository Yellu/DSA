package com.yellu.dsapractice.dsa

fun main() {
    val musicPlayer = MusicPlayer()
    musicPlayer.addSong(1, "Sid Sriram", "Sid 1", Genre.POP)
    musicPlayer.addSong(2, "Arjit", "Arjit 1", Genre.POP)
    musicPlayer.addSong(3, "MM", "MM 1", Genre.POP)
    musicPlayer.addSong(4, "Devi", "Devi 1", Genre.POP)
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