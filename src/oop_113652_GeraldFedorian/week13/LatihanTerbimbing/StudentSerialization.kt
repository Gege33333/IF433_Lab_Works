package oop_113652_GeraldFedorian.week13.LatihanTerbimbing

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0],parts[1].toInt(), parts[2].toDouble())
}