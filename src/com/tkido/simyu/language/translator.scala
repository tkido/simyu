package com.tkido.simyu.language

import com.tkido.simyu._

object Translator {
  def apply(action:Action) :String = {
    action match{
      case GreetingAction(a) => a.label + "「ゆっくりしていってね！！！」"
      case _ => ""
    }
  }
}