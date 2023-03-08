package project_euler.utils

import kotlin.math.sqrt

// Является ли число (int) простым
fun isPrime(n: Int): Boolean {
    val limit = sqrt(n.toDouble()).toInt()
    for (i in (2..limit).filter { n % it == 0 }) {
        return false
    }
    // ↓ Вывод всех простых чисел ↓
    // println(n)
    return true
}

// Является ли число (long) простым
fun isPrime(n: Long): Boolean {
    val limit = sqrt(n.toDouble()).toLong()
    for (i in (2..limit).filter { n % it == 0L }) {
        return false
    }
    // ↓ Вывод всех простых чисел ↓
    // println(n)
    return true
}

// Является ли число палиндромом
fun isPalindromicNumber(number: Int): Boolean {
    // Перевод числа в строку
    val inputNumber = number.toString()
    // Реверс строки
    val reversedNumber = inputNumber.reversed()
    // Сравнение
    return inputNumber == reversedNumber
}