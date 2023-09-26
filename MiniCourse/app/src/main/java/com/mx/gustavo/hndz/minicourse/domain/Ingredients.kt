package com.mx.gustavo.hndz.minicourse.domain

open class Ingredients {
    var quantity: Double = 0.0

    fun printName(ingredientName: String): String {
        return if (ingredientName == "Ingredients") {
            "Sin Ingrediente"
        } else {
            ingredientName
        }

    }

}

fun main() {
    print(Ingredients().printName(Ingredients::class.simpleName.toString()))
}