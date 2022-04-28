package br.com.kotlin4dev.section_04._0405

fun main() {

    val myInt = 199
    val aInt: Int = 7

    // int lowest = (myInt < aInt) ? myInt : aInt
     val lowest = if (myInt < aInt) myInt else aInt // qdo o IF é usado com uma expressão ele deve conter obrigatóriamente o else

    val temp = 20
    val isAirConditionerOn = if (temp >= 26) {
        println("it is a warm")
        true
    } else {
        println("it is no so warm")
        false
    }
    println("Is the conditioner on: $isAirConditionerOn")
}