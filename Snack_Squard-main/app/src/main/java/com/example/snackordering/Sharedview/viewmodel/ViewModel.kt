package com.example.snackordering.Sharedview.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class sharedview : ViewModel(){
    private val res: MutableState<String> = mutableStateOf(" ")
    val Res: State<String> =res
    private val res1: MutableState<String> = mutableStateOf(" ")
    val Res1: State<String> =res1
    private val res2: MutableState<String> = mutableStateOf(" ")
    val Res2: State<String> =res2
    private val res3: MutableState<String> = mutableStateOf(" ")
    val Res3: State<String> =res3

    fun setdata(data:String){
        res.value=data

    }
    fun setdata1(data:String){
        res1.value=data

    }
    fun setdata2(data:String){
        res2.value=data

    }
    fun setdata3(data:String){
        res3.value=data

    }
}