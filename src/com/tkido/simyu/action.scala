package com.tkido.simyu

abstract class Action

case object GreetingAction extends Action{
  override def toString = "ゆっくりしていってね！！！"
}