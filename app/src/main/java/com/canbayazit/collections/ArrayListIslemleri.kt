package com.canbayazit.collections

fun main() {

    val meyveler =ArrayList<String>()

    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty())//false
    println(meyveler.count())//boyut
    println(meyveler.size)//boyut

    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kiraz"))//true  listede kiraz var mı yok mu?

    //Harf sıralamasına göre
    println(meyveler.max())
    println(meyveler.min())

    //Sıralama
    println(meyveler.sort())
    println(meyveler.toString())

//Listeyi tersine çevirme
    meyveler.reverse()
    println(meyveler.toString())


    // indekse göre Silme
    meyveler.removeAt(3)
    println(meyveler.toString())


    //İlgili veriyi silme
    meyveler.remove("Kivi")
    println(meyveler.toString())

    //Listeyi komple boşaltmak
    meyveler.clear()
    println(meyveler.toString())






}