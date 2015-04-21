package com.tkido.simyu.yukkuri

import scala.math

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri(val species:Species) extends Actor with Identical{
  Logger.debug(id)
  
  var size:Double = 1.0
  var life:Double = 1.0
  var energy:Double = 1.0
  
  def simulate{
    metabolize
    ActionHandler(PassAction(this))
    //ActionHandler(GreetingAction(this, EveryOne))
  }
  
  private def metabolize{
    val consumption = math.pow(size, 9.0/4.0) / 5760 //4*24*60 = 4日間
    if(consumption > energy)
      ActionHandler(DieAction(this))
    else
      energy -= consumption
  }
  
  
  override def toString = {
    val shortId = id.take(4)
    f"""$label%s($shortId%s) size:$size%2.4f life:$life%2.4f energy:$energy%2.4f"""
  }
}
