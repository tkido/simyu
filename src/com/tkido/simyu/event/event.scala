package com.tkido.simyu.event

abstract class Event {

}

case class Greeting(msg:String) extends Event {
  override def toString = msg
}


