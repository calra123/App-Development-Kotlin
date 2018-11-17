package com.calc.findmax

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        maxi.setOnClickListener { didPress() }
    }

    fun didPress()
    {
        var n=num1.text.toString()
        var n1=n.toInt()
        var m=num2.text.toString()
        var m1=m.toInt()
        var maxi:Int=if(n1>m1) n1 else m1
        Output.text="$maxi"
    }
}
