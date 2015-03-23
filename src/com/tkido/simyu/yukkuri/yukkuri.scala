package com.tkido.simyu.yukkuri

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger
import java.util.UUID

abstract class Species
object ReimuSpecies extends Species
object MarisaSpecies extends Species

abstract class Yukkuri extends Identical with Live with Physical{
  Logger.debug(id)
  
  var parts:List[Parts] = List(new Core())
  
  
  def simulate{
    ActionHandler(GreetingAction)
  }
}
