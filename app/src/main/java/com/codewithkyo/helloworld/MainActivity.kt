package com.codewithkyo.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codewithkyo.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        //val btnClickMe = findViewById(R.id.button) as Button
        //val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0

        // set on-click listener
        binding.button.setOnClickListener {
            ++ timesClicked
            binding.textView.text = timesClicked.toString()
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Hi Yamamoto.", Toast.LENGTH_SHORT).show()
        }
    }
}