package com.tkido.simyu.language

import com.tkido.simyu._
import com.tkido.simyu.simulation.Actor

object Translator {
  def apply(action:Action) :String = {
    val (actor, content) = action match{
      case GreetingAction(a) => (a, "ゆっくりしていってね！！！")
      //case _ => ()
    }
    """%s「%s」""".format(actor.label, content)
  }
}