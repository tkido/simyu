package com.tkido.simyu.yukkuri

abstract sealed class Species
case object ReimuSpecies extends Species{
  val label = "れいむ"
}
