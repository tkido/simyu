package com.tkido.simyu.yukkuri

import scala.math

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri(val species:Species) extends Actor with Identical{
  Logger.debug(id)
  
  private var size:Double = 1.0
  private var life:Double = 1.0
  private var energy:Double = 1.0
  
  private var cr = 1.0
  
  def simulate{
    metabolize
    ActionHandler(PassAction(this))
    //ActionHandler(GreetingAction(this, EveryOne))
  }
  
  
  def setSize(newSize:Double){
    size = newSize
    cr = math.pow(size, 9.0/4.0) * 0.001
    println(cr)
  }
  
  private def metabolize{
    if(cr > energy)
      ActionHandler(DieAction(this))
    else
      energy -= cr
  }
  
  
  override def toString = {
    val shortId = id.take(4)
    f"""$label%s($shortId%s) size:$size%2.4f life:$life%2.4f energy:$energy%2.4f"""
  }
}
