package com.tkido.simyu.simulation

trait Identical{
  import java.util.UUID
  val id = UUID.randomUUID().toString
}

abstract class Actor{
  val label = "誰か"
}
