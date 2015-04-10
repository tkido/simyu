package com.tkido.simyu.yukkuri

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri(val species:Species) extends Actor with Identical{
  Logger.debug(id)
  
  override val label = "ゆっくり"
  
  var size = 30.0
  var life = 1.0
  var energy = 1.0
  
  def simulate{
    ActionHandler(GreetingAction(this))
  }
  
  override def toString = {
    f"""$label%s($id%s) size:$size%2.2f life:$life%2.2f energy:$energy%2.2f"""
  }
}
