package com.tkido.simyu.yukkuri

import com.tkido.game._
import com.tkido.simyu._
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger

abstract class Yukkuri extends Identical{
  Logger.debug(id)
  
  def simulate{
    ActionHandler(GreetingAction)
  }
}
