package com.tkido.game

import com.tkido.simyu._
import com.tkido.simyu.language._

object ActionHandler {
  def apply(action:Action){
    View(action)
    View(Translator(action))
    action match{
      case a:GreetingAction => {
        //実際の処理
      }
      case _ => ()
    }
  }
}