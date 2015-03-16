package com.tkido.simyu.simulation

trait Live {
  var live = true
  def isLive() :Boolean = live
}
trait Physical {}
trait Conscious {}
trait Organic {}
trait Economic {}
