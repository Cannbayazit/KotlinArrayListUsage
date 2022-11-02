package com.canbayazit.collections

fun main() {


    val liste = ArrayList<String>()


    val liste2:ArrayList<Int> = ArrayList<Int>()


    val meyveler = ArrayList<String>()

    meyveler.add("Cilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.toString())

//VERİ ERİŞİM METOD 1
    val str = meyveler.get(2)
    println(str)

//VERİ ERİŞİM METOD 2
    val str1 = meyveler[4]
    println(str1)



    meyveler.add("Mandalina")
    println(meyveler.toString())


    //ÜZERİNE EKLEME
    meyveler[2] = "Ananas"// ELMA üzerine ananas ekledik elma cıktı
    println(meyveler.toString())

    //ARASINA  EKLEME
    meyveler.add(3,"Portakal")//    seçilen indexte var olan veriyi sağa kaydırarak ekleme yapar.
    println(meyveler.toString())




}