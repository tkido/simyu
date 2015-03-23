package com.tkido.game

class Game(controller:Controller, view:View) {
  import com.tkido.tools.Logger
  import com.tkido.simyu.yukkuri._
  
  mainloop(Create)
  
  @annotation.tailrec
  private def mainloop(command:Command) :Unit = {
    execute(command)
    if(command != Quit)
      mainloop(controller.get())
  }
  
  def execute(command:Command) {
    command match {
      case Quit => quit(command)
      case Create => create(command)
      case _ => ()
    }
  }
  
  def create(command:Command){
    Logger.debug("create")
    val yu = YukkuriFactory(ReimuSpecies)
    yu.simulate
    Logger.debug(yu.isLive())
    Logger.debug(yu.parts)
  }
  
  def quit(command:Command){
    Logger.debug("quit")
  }

}