package com.tkido.simyu

import com.tkido.simyu.simulation.Actor

abstract sealed class Action(actor:Actor)

case class GreetingAction(actor:Actor) extends Action(actor)