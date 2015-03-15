package com.tkido.game

abstract case class Event {

}

case class MessageEvent(msg:String) extends Event {
  override def toString = msg
}


