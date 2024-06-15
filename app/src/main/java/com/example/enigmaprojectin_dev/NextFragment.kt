package com.example.enigmaprojectin_dev

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.enigmaprojectin_dev.databinding.FragmentNextBinding

class NextFragment: Fragment() {

    private lateinit var binding: FragmentNextBinding
    private val mediaPlayer = MediaPlayer()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNextBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.playradio.setOnClickListener {
            playRadio()
            initializePlayer("http://stream4.nadaje.com:15476/radiobialystok")
        }
        


    }

    private fun initializePlayer(radioUrl: String) {
        mediaPlayer.apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setLegacyStreamType(AudioManager.STREAM_MUSIC)
                    .build()
            )
            setOnPreparedListener { player ->
                player.start()
            }
            setDataSource(radioUrl)
            prepareAsync()
        }
    }

    private fun playRadio() {
        if (!mediaPlayer.isPlaying) {
            mediaPlayer.start()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }

}

