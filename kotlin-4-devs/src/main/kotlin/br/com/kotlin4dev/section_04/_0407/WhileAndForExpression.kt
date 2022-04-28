package br.com.kotlin4dev.section_04._0407

fun main() {

    var x = 0

    while (x < 10) {
        println("x = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    // Um loop for clássico contém;
    //for(int i=0; i < 10; i++) { Corpo do loop for }
    // Isso não exite em Kotlin

    // Um loop for em Kotlin contém;
    for (item in 1 .. 10) {
        //item++ (Isso não fuciona em Kotlin)
        // o item dentro do for é um valor imutavel pois ele é declarado com um val
        print("$item, ")
    }

    for (ch in "VITOR") {
        println(ch)
    }
}