package com.calc.primecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isPress=false
    var total=0
    var count=-1
    var prim= Array(100){0}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butt.setOnClickListener{ startUp()}
        next.setOnClickListener { callNext() }
        prev.setOnClickListener { callPrev() }

    }

    private fun startUp()
    {
        var isPress=false
        var total=0
        var count=-1
        ans.text=" "

        didPress()
    }

private fun callNext() {

        isPress=true
        count++;
        if(count>=total)
            count=total-count
        show(count)

    }

    private fun callPrev()
    {
        if(count>0)
            count--

        show(count)

    }

private fun show(c:Int)
    {
       ans.text=prim[c].toString()
        isPress=false
    }
private fun didPress()
{
        var n= num1.text.toString()

        var n1:Int= n.toInt()
        var m=num2.text.toString()
        var n2:Int= m.toInt()

        if(n1>n2)
        {
            var temp:Int=n1;
            n1=n2
            n2=temp
        }
        var arr= Array<Int>(1000){0}
        arr[0]=1
        arr[1]=1
        for(i in 2..n2)
        {
            var j=i+i
            if(arr[i]==0)
            {
                while(j<=n2)
                {
                    arr[j]=1
                    j=j+i
                }

            }
        }

    //Use isPress...
        var l=0
        for(i in n1..n2)
        {
            if(arr[i]==0) {
                prim[l]= i
               l++
                isPress = false
            }

        }
    total=l
    count=0
    show(count)

    }
}


