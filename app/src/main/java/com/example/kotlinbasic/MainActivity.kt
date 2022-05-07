package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        문법 연습 (변수)

//        변수 만들기

        val myName = "몰리" // 변수 생성과 대입을 동시에 하는 것을 '초기화'라고 함 (변수의 초기화)

        Log.d("변수값",myName)


        clickBtn.setOnClickListener {

//            이 {} 안 코드만, 버튼 눌렸을 때 실행됩니다.

            Log.d("메인화면로그","클릭용 버튼이 눌림")
            Log.e("메인화면로그","에러 관련 로그")
        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

   }

}