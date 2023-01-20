package ru.stas.codapizza.model

import androidx.annotation.StringRes
import ru.stas.codapizza.R

enum class ToppingPlacement (
    @StringRes val label: Int
){
    Left(R.string.placement_left),
    Right(R.string.placement_right),
    All(R.string.placement_all)
}