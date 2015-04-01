package com.tkido.simyu.yukkuri

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri(val species:Species) extends Actor with Identical{
  Logger.debug(id)
  
  override val label = "ゆっくり"
  
  def simulate{
    ActionHandler(GreetingAction(this))
  }
}
