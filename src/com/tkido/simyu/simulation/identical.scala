package com.tkido.simyu.simulation

import com.tkido.simyu.tools.Randomizer

trait Identical{
  val id = Randomizer.newId
}


abstract class Thing{
  val label:String
}

abstract class Actor extends Thing{
}

case object EveryOne extends Actor{
  val label = "みんな"
}
case object Human extends Actor{
  val label = "おにいさん"
}
