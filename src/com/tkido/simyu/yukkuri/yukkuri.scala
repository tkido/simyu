package com.tkido.simyu.yukkuri

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri(val species:Species) extends Actor with Identical{
  Logger.debug(id)
  
  var size = 30.0
  var life = 1.0
  var energy = 1.0
  
  def simulate{
    ActionHandler(PassAction(this))
    ActionHandler(GreetingAction(this, EveryOne))
  }
  
  override def toString = {
    val shortId = id.take(4)
    f"""$label%s($shortId%s) size:$size%2.2f life:$life%2.2f energy:$energy%2.2f"""
  }
}
