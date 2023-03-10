package project_euler.problem_1_25

import project_euler.utils.isPrime

/**
 * Summation of primes. / Сложение простых чисел.
 * <p>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * <p>
 * Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.
 * Найдите сумму всех простых чисел меньше двух миллионов.
 */

fun main() {
    val number = 2_000_000

    var result = 0L

    for (i in (2 until number).filter { isPrime(it) }) {
        result += i
    }
    println("The sum of all the primes below $number is $result.")
}