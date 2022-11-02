package com.canbayazit.collections

import java.util.Scanner

fun main() {

    val girdi = Scanner(System.`in`)


    var sayac = 1
    val ogrenciler = ArrayList<Ogrenci>()

    while (true){

        println("Öğrenci Adı Giriniz ")
        val ad = girdi.next()
        println("Öğrenci sınıfı giriniz")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac = sayac+1

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak için (1) - Devam etmek için diğer sayılar")

        val cikis = girdi.nextInt()


        if (cikis == 1){

            for (ogrenci in ogrenciler){

                println("*************")
                println("Ögrenci no :${ogrenci.no}")
                println("Ögrenci adı : ${ogrenci.ad}")
                println("Ögrenci sınıf : ${ogrenci.sinif}")

            }
            println("Cıkış yapıldı")

            break
        }



    }


}