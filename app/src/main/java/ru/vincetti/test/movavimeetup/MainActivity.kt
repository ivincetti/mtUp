package ru.vincetti.test.movavimeetup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.vincetti.test.movavimeetup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initViews()
    }

    private fun initViews(){
        binding
    }


}