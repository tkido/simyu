package com.tkido.simyu

import com.tkido.simyu.simulation.Actor
import com.tkido.simyu.simulation.Thing

abstract sealed class Action(actor:Actor)
abstract sealed class TargetAction(actor:Actor, target:Thing) extends Action(actor)

case class PassAction(actor:Actor) extends Action(actor)
case class GreetingAction(actor:Actor, target:Thing) extends TargetAction(actor, target)

