package com.abc_analytics.omikuji2

import java.util.*

class OmikujiBox {
    val number: Int
    get() {
        val rnd = Random()
        return rnd.nextInt(20)
    }

}