package com.canbayazit.collections

fun main() {

    val o1 = Ogrenci(1,"Ahmet","11F")
    val o2 =Ogrenci(2,"Zeynep","10R")
    val o3 =Ogrenci(3,"Ceyda","12A")
    val o4 = Ogrenci(4,"Mehmet","9Z")
    val o5 = Ogrenci(4,"Yasin","11F")


    val ogrenciler =ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    val sonuListe = ogrenciler.filter {(it.ad).contains("a")  }


    for (o in sonuListe){

        println("***************")
        println("Öğrenci no  : ${o.no}")
        println("Öğrenci ad : ${o.ad}")
        println("Öğrenci sınıf : ${o.sinif}")

    }





}