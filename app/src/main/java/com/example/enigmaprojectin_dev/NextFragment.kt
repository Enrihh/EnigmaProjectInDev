package com.example.enigmaprojectin_dev

import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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

        val playButton: Button = view.findViewById(R.id.playradio)
        playButton.setOnClickListener {
            playRadio()
            initializePlayer("https//vip1.fhbf9.com/20210705/eoQxrzxS/index.m3u8")
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
}
