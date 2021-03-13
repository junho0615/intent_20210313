package com.neppplus.intent_20210313

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_first.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {

            val myIntent = Intent(this, MyFirstActivity::class.java)

            startActivity(myIntent)

            }
        
        moveToSecondBtn.setOnClickListener {

            val inputMessage = messageEdt.text.toString()

//            화면 이동인건 동일.=> Intent 기초 사용법은 그대로 적용.
            
//            비행기 티켓
            val myIntent = Intent(this, MySecontdActivity::class.java)

//            티켓에 데이터 추가 기록.
            myIntent.putExtra("message", inputMessage)
//            실제 탑승
            startActivity(myIntent)
        }

        editNickBtn.setOnClickListener {

            val myIntent = Intent(this, EditNiknameMainActivity2::class.java)
        }
    }
}