package com.tkido.game

class Game(controller:Controller, view:View) {
  import com.tkido.tools.Logger
  import com.tkido.simyu.yukkuri._
  
  execute(Create)
  
  var command:Command = Quit
  do{
    command = controller.get()
    execute(command)
  }while(command != Quit)
  
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
    yu.step
    Logger.debug(yu.isLive())
    Logger.debug(yu.parts)
  }
  
  def quit(command:Command){
    Logger.debug("quit")
  }

}