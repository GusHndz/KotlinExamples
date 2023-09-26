package com.mx.gustavo.hndz.minicourse.domain.soup

import com.mx.gustavo.hndz.minicourse.common.TypeCutTortillaEnum
import com.mx.gustavo.hndz.minicourse.common.TypeTortillaEnum
import com.mx.gustavo.hndz.minicourse.domain.Chili
import com.mx.gustavo.hndz.minicourse.domain.Garlic
import com.mx.gustavo.hndz.minicourse.domain.Ingredients
import com.mx.gustavo.hndz.minicourse.domain.Onion
import com.mx.gustavo.hndz.minicourse.domain.Tomato
import com.mx.gustavo.hndz.minicourse.domain.Tortilla

class AztecSoup : BrothListener {

    override fun makeBroth(lstIngredients: List<Ingredients>): String {
        //Necesitamos estos ingredientes
        var strIngredient = ""
//        var listIngredientsToBoil: MutableList<Ingredients> = mutableListOf()

        lstIngredients.forEach { ingredient ->
            strIngredient += ingredient.printName(ingredient::class.simpleName.toString()) + "\n"

//            if (ingredient::class.simpleName.toString() == "Tomato" ||
//                ingredient::class.simpleName.toString() == "Chili") {
//                listIngredientsToBoil.add(ingredient)
//            }
        }

        // STEP 1 - Picar tortilla
        var step1 = ""

        try {
            val tortilla: Tortilla? = lstIngredients.first { ingredient ->
                ingredient::class.simpleName.toString() == "Tortilla"
            } as? Tortilla

//        if (tortilla != null) {
//
//        }

            tortilla?.let {
                step1 = this.cutTortilla(it,  TypeCutTortillaEnum.TRIANGLE)
            }
        } catch (ex: Exception) {
            step1 = "No hay Tortillas"
        }

        // STEP 2 - Freir tortilla
        // STEP 3 - Precocer Jitomate y chilehuajillo
        val listIngredientsToBoil = lstIngredients.filter { ingredient ->
            ingredient::class.simpleName.toString() == "Tomato" ||
                    ingredient::class.simpleName.toString() == "Chili"
        }

        val step3 = this.boilIngredients(listIngredientsToBoil)

        return "Mi caldo tiene estos Ingredientes:" +
                "\n$strIngredient\n" +
                "1.- $step1\n" +
                "3.- $step3"
    }

    private fun cutTortilla(
        tortilla: Tortilla,
        cutType: TypeCutTortillaEnum
    ): String {

//        if(cutType == TypeCutTortillaEnum.RECTANGLE) {
//
//        } else if (cutType == TypeCutTortillaEnum.TRIANGLE){
//
//        } else {
//
//        }

        val strTypeCut = when(cutType) {
            TypeCutTortillaEnum.RECTANGLE -> {
                TypeCutTortillaEnum.RECTANGLE.strName
            }

            TypeCutTortillaEnum.TRIANGLE -> {
                TypeCutTortillaEnum.TRIANGLE.strName
            }
        }

        tortilla.cut = cutType

        return "Mis tortillas fueron picadas con forma de: $strTypeCut"
    }

    private fun boilIngredients(ingredient: List<Ingredients>): String {
        var strIngredient = ""

        ingredient.forEach {
            strIngredient += it.printName(it::class.simpleName.toString()) + "\n"
        }

        return "Precocemos estos Ingredientes:\n$strIngredient"
    }

}

fun main() {
    val soup = AztecSoup()
    val ingredients: List<Ingredients> = listOf(
        Tomato(),
        Onion(),
        Chili(),
        Garlic(),
        Tortilla(
            size = TypeTortillaEnum.CIRCLE_NORMAL,
            cut = null
        )
    )


    print(soup.makeBroth(ingredients))
}