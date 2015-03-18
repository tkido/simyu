package com.tkido.game

import com.tkido.simyu._

object ActionHandler {
  def apply(action:Action){
    action match{
      case a => View(a)
    }
  }
}