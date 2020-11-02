package com.example.a20201102

import SharedPreferenceWrapper
import android.content.Context

// 텍스트 저장과 인출을 담당하는 클래스
class textRepository(private val context:Context)
{
    private val wrapper =SharedPreferenceWrapper(context)
    private var theText:String=""

    fun saveText(text:String){
        wrapper.putString("THE_TEXT", text)
        theText=text
    }
    fun loadtext(): String {
        return wrapper.getString(key="THE_TEXT") ?: "{No data}"
    }
}