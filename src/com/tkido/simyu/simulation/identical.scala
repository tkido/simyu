package com.tkido.simyu.simulation

trait Identical{
  import java.util.UUID
  val id = UUID.randomUUID().toString
}