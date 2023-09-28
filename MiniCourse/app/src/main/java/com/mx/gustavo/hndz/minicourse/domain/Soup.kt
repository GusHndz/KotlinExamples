package com.mx.gustavo.hndz.minicourse.domain

open class Soup {
    private var price: Double = 0.0

    fun newPrice(newPrice: Double) {
        this.price = newPrice
    }
    fun getPrice(): Double {
        return this.price
    }
}