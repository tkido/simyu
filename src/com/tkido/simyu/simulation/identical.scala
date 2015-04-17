package com.tkido.simyu.simulation

trait Identical{
  import java.util.UUID
  val id = UUID.randomUUID().toString
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
