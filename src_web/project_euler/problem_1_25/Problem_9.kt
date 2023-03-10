package project_euler.problem_1_25

/**
 * Special Pythagorean triplet. / Особая тройка Пифагора.
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2.
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * <p>
 * Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство a^2 + b^2 = c^2.
 * Например, 32 + 42 = 9 + 16 = 25 = 52.
 * Существует только одна тройка Пифагора, для которой a + b + c = 1000.
 * Найдите произведение abc.
 */

fun main() {
    val number = 1000

    // Так как (i < j < k), а (i + j + k = 1000), то максимальное значение i = (1000 / 3)
    for (i in 1..(number / 3)) {
        // Так как (i < j < k), а (i + j + k = 1000), то максимальное значение j = (1000 / 2)
        for (j in (i + 1)..(number / 2)) {
            val k = number - i - j
            if (i * i + j * j == k * k) {
                val result = i * j * k
                println("The product abc is $result.")
                break
            }
        }
    }
}