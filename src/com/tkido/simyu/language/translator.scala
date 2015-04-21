package com.tkido.simyu.language

import com.tkido.simyu._
import com.tkido.simyu.simulation._

object Translator {
  def apply(action:Action) :String = {
    val content = action match{
      case PassAction(a) => a.label + "はゆっくりしているよ！"
      case GreetingAction(a, t) => t.label + "ゆっくりしていってね！！！"
      case _ => ()
    }
    """%s「%s」""".format(action.actor.label, content)
  }
}