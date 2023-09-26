package com.mx.gustavo.hndz.minicourse.domain

import com.mx.gustavo.hndz.minicourse.common.OnionColorEnum

/**
 * Tortilla <- properties
 */
data class Onion(
    val color: OnionColorEnum = OnionColorEnum.WHITE
): Ingredients()
