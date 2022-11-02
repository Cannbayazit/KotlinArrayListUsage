package com.canbayazit.collections

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()
    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("zeynep")
    isimler.add("sedat")
    isimler.add("ercan")

    println("Bulmak istediğiniz ismi giriniz")
    val isim = girdi.next()


    for(i in isimler){

        if ( i == isim){
            println("İSİM MEVCUT")
            break
        }

    }
}