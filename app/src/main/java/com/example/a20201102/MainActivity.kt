package com.example.a20201102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 //   private val repository=textRepository(this /*나쁘지 않지만 어쩔 수 없는 선택*/)

    private val repository:textRepository by lazy{
        textRepository(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView(){
        //저장 버튼이 눌렸을 때: the input에 작성된 텍스트 가져와서 저장
        save_button.setOnClickListener {
            val text:String= the_input.text.toString()
            repository.saveText(text)
        }

        //불러오기 버튼이 눌렸을 때: 저장된 텍스트 가져와서 the text에 표시.
        load_button.setOnClickListener {
            val text:String=repository.loadtext() //불러온 텍스트
            the_text.text=text
        }
    }

}