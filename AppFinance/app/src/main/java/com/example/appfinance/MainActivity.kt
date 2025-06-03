package com.example.appfinance

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.appfinance.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
        //SPLASH . JSON
Handler(Looper.getMainLooper()).postDelayed({
    var intent = Intent(this, Login::class.java)
}, 4000)
**/

/**
        // SPLASH . MP4
        val videoView = findViewById<VideoView>(R.id.videoLogo)
        val packageName = "android.resourse://" + getPackageName()+"/"+ R.raw.splash
        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)
        videoView.start()

        videoView.setOnCompletionListener {
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
**/

    // loading
    Handler().postDelayed({
              var intent = Intent(this, Login::class.java)
              startActivity(intent)
          }, 3000)
/**
        // Button start
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonStart.setOnClickListener{
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }**/
    }
}