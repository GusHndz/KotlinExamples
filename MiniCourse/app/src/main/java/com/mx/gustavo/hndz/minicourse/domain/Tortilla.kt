package com.mx.gustavo.hndz.minicourse.domain

import com.mx.gustavo.hndz.minicourse.common.TypeCutTortillaEnum
import com.mx.gustavo.hndz.minicourse.common.TypeTortillaEnum

/**
 * Tortilla <- properties
 */
data class Tortilla(
    val size: TypeTortillaEnum = TypeTortillaEnum.CIRCLE_NORMAL,
    var cut: TypeCutTortillaEnum?
): Ingredients()
