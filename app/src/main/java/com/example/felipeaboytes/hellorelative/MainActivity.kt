package com.example.felipeaboytes.hellorelative

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.felipeaboytes.hellotoast.R
import com.example.felipeaboytes.hellotoast.R.id.show_count
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var mCount: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun countUp(v: View) {
        mCount+=1
        show_count.text=mCount.toString()

    }


    fun showToast(v: View){
        Toast.makeText(this,R.string.button_label_toast,Toast.LENGTH_SHORT).show()
    }

}
