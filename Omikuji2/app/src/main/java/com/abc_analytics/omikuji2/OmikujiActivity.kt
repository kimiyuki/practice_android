package com.abc_analytics.omikuji2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.main.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        var str = "大吉"
        val rnd = Random()
        val number = rnd.nextInt(3)
        val omikujiShelf = Array<String>(20, {"吉"})
        omikujiShelf[1] = "Hello"
        Log.d("DEBUG2", Arrays.toString(omikujiShelf));
        when (number) {
            0 -> str = "吉"
            1 -> str = "xx"
            2 -> str = "not bad"
        }
        hello_view.text = "$str 乱数 ${number + 1}"
    }
}
