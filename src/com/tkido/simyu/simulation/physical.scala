package com.tkido.simyu.simulation

trait Live {
  var live = true
  def isLive() :Boolean = live
}

trait Identical{
  import java.util.UUID
  val id = UUID.randomUUID().toString
}

trait Physical {}
trait Conscious {}
trait Organic {}
trait Economic {}
