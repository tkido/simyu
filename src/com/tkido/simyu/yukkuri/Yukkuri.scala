package com.tkido.simyu.yukkuri

import com.tkido.simyu.simulation._

abstract class Species
object ReimuSpecies extends Species
object MarisaSpecies extends Species

abstract class Yukkuri extends Live with Physical{
  var parts:List[Parts] = List(new Core())
}
