package com.mx.gustavo.hndz.minicourse.common

import com.mx.gustavo.hndz.minicourse.domain.Soup


object Utils {
    fun payment(soup: Soup) {
        if (soup.getPrice() == 0.0) {
            throw IllegalArgumentException("La sopa tiene precio de 0 pesos")
        } else {
            //cobrar
            //dar cambio
        }
    }

    fun validatePassword(pass: String) {
//        if (pass.isEmpty()) {
//            throw IllegalArgumentException("La contraseña no debe estar vacia")
//        } else {
//            if (pass.trim().length < 15) {
//                throw IllegalArgumentException("La contraseña debe tener 15 caracteres")
//            } else {
//                if (pass.contains(' ')) {
//                    throw IllegalArgumentException("La contraseña no debe contener espacios")
//                } else {
//
//                }
//            }
//        }

        if (pass.isEmpty()) {
            throw IllegalArgumentException("La contraseña no debe estar vacia")
        } else if (pass.trim().length < 15) {
            throw IllegalArgumentException("La contraseña debe tener 15 caracteres")
        } else if (pass.contains(' ')) {
            throw IllegalArgumentException("La contraseña no debe contener espacios")
        } else {

        }

    }
}