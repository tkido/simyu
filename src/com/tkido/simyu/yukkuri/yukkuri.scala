package com.tkido.simyu.yukkuri

import com.tkido.simyu.simulation._
import com.tkido.tools.Logger
import java.util.UUID

abstract class Species
object ReimuSpecies extends Species
object MarisaSpecies extends Species

abstract class Yukkuri extends Live with Physical{
  val id = UUID.randomUUID().toString
  Logger.debug(id)
  
  var parts:List[Parts] = List(new Core())
  
  def step{
    
  }
}