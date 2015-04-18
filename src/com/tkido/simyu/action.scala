package com.tkido.simyu

import com.tkido.simyu.simulation.Actor
import com.tkido.simyu.simulation.Thing

abstract sealed class Action{
  val actor:Actor
}
abstract sealed class TargetAction extends Action{
  val target:Thing
}

case class PassAction(actor:Actor) extends Action
case class GreetingAction(actor:Actor, target:Thing) extends TargetAction
