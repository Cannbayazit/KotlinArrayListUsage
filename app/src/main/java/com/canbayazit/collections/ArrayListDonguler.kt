package com.canbayazit.collections

fun main() {

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for (meyve in meyveler){

        println("Sonuç : $meyve")

    }
    //İndeks numarası ile alma

    for ((indeks,meyve) in meyveler.withIndex()){
        println("Sonuç : $indeks :$meyve")


    }



}