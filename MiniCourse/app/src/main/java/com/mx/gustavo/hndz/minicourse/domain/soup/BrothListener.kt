package com.mx.gustavo.hndz.minicourse.domain.soup

import com.mx.gustavo.hndz.minicourse.domain.Ingredients

interface BrothListener {
    fun makeBroth(ingredient: List<Ingredients>): String
}