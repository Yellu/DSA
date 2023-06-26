package com.yellu.dsapractice.dsa

import java.util.LinkedList
import java.util.Queue
import kotlin.random.Random

class MusicPlayer {
    private val musicList = ArrayList<Song>()
    private var musicQ: Queue<Song> = LinkedList<Song>()
    private var totalSongCount = 0
    private var random: Random = Random

    internal fun initPlayer() {
        println("Initialize music player")
    }

    internal fun addSong(id: Int, singer: String, songName: String, type: Genre) {
        musicList.add(totalSongCount++, Song(id, songName, singer, type))
    }

    internal fun playRandomSong() {
        val randomPos = random.nextInt(totalSongCount--)
        val playingSong = musicList.removeAt(randomPos)
        musicQ.add(playingSong)
        println("The song : ${playingSong.songName} is been added to playing queue")
        musicList.add(playingSong)
    }

    internal fun playSong(id: Int, addToQ: Boolean) {
        for (i in 0 until totalSongCount) {
            val songX = musicList[i]
            if (songX.songId == id) {
                musicList.removeAt(i)
                --totalSongCount
                if (addToQ) {
                    println("The song : ${songX.songName} is been added to playing queue")
                    musicQ.add(songX)
                } else {
                    println("The song : ${songX.songName} is currently played")
                }
                musicList.add(songX)
                return
            }
        }

        for (i in totalSongCount until musicList.size) {
            val songX = musicList[i]
            if (songX.songId == id) {
                if (addToQ) {
                    println("The song : ${songX.songName} is been added to playing queue")
                    musicQ.add(songX)
                } else {
                    println("The song : ${songX.songName} is currently played")
                }
                return
            }
        }
        return
    }

    internal fun closeMusicPlayer() {
        println(" Closing Music Player")
        musicQ.clear()
        totalSongCount = musicList.size
    }

    internal fun playMusicFromQueue() {
        println("The current queue contains : [ ")
        musicQ.forEach {
            println(it.songName)
        }
        println(" ]")
    }
}