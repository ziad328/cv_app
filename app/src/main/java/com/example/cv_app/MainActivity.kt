package com.example.cv_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cv_app.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Picasso.get()
            .load(R.drawable.ziad)
            .transform( CircleTransform())
            .into(binding.image);

        previewCVPdf()
    }
    private fun previewCVPdf() {
        binding.content.pdfView.fromAsset("cv.pdf")
            .swipeHorizontal(true)
            .enableSwipe(true)
            .load()
    }

}