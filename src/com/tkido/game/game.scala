package com.tkido.game

class Game(controller:Controller, view:View) {
  import com.tkido.tools.Logger
  import com.tkido.simyu.yukkuri.Yukkuri
  
  while(true){
    execute(controller.get())
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
    val yu = new Yukkuri("reimu")
    yu.step
  }
  
  def quit(command:Command){
    Logger.debug("quit")
  }

}