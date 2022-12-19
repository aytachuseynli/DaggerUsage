package com.aytachuseynli.daggerusage

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var address: Address) {

       fun apply(){
        Log.e("Result", "Internet application: ${address.info}")

    }
}