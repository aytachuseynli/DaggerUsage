package com.aytachuseynli.daggerusage

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor(var address: Address){

    fun send(){
        Log.e("Result", "Cargo is sent to ${address.info}")

    }
}