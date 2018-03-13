package com.bajiuk.medium.single

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ++INSTANCES
        Log.d(TAG,"There are $INSTANCES of a Activity in memory now.")
    }

    override fun onDestroy() {
        --INSTANCES
        super.onDestroy()
    }

    companion object {
        var INSTANCES = 0
        val TAG = MainActivity::class.java.simpleName
    }
}
