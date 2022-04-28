package br.com.kotlin4dev.section_04._0406

// NO Kotlin a esperssão WHEN substitui o switch do JAVA
fun main() {
    val pizzaOrdered = 8

    when (pizzaOrdered) {
        0 -> println("Not Hungry")
        1 -> println("Hungry")
        2 -> println("Very Hungry")
        else -> println("Are your sure?")
    }

    when (pizzaOrdered) {
        0 -> println("Not Hungry")
        1, 2 -> println("Hungry")
        2 -> println("Very Hungry")
        else -> println("Are your sure?")
    }

    when (pizzaOrdered) {
        Math.abs(pizzaOrdered) -> println("Ordered 0 or more Pizzas")
        else -> println("Oredered less than 0")
    }

    when (pizzaOrdered) {
        0 -> println("We Need Orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 9 -> println("Business is UP")
        else -> println("Are your sure?")
    }

    when {
        pizzaOrdered <= 0 -> println("None ordered")
        pizzaOrdered % 2 == 1 -> println("Odd number oredered")
        pizzaOrdered % 2 == 0 -> println("Even number oredered")
    }
}