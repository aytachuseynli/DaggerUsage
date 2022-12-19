package com.aytachuseynli.daggerusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var cargo: Cargo
    @Inject
    lateinit var internet: Internet
    //Dagger: not use private
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        cargo.send()
        internet.apply()
    }
}