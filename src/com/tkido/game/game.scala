package com.tkido.game

class Game(controller:Controller, view:View) {
  while(true){
    execute(controller.get())
  }
  
  def execute(command:Command) {
    command match {
      case Quit => quit(command)
      case Create => create(command)
      case _ => view.show(new MessageEvent(""))
    }
  }
  
  def create(command:Command){
    view.show(new MessageEvent("創造します"))
    
  }
  
  def quit(command:Command){
    view.show(new MessageEvent("終了します。"))
  }

}