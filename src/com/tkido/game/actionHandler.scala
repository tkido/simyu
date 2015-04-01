package com.tkido.game

import com.tkido.simyu._
import com.tkido.simyu.language._

object ActionHandler {
  def apply(action:Action){
    action match{
      case a:GreetingAction => {
        View(a)
        View(Translator(a))
      }
      case a => View(a)
    }
  }
}