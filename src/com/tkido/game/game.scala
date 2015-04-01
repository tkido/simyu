package com.tkido.game

class Game(controller:Controller, view:View) {
  import com.tkido.tools.Logger
  import com.tkido.simyu.yukkuri._
  import scala.collection.mutable.{Set => MSet}
  
  val yukkuries:MSet[Yukkuri] = MSet()
  
  mainloop(Create)
  
  @annotation.tailrec
  private def mainloop(command:Command) :Unit = {
    execute(command)
    if(command != Quit)
      mainloop(controller.get())
  }
  
  def execute(command:Command) {
    command match {
      case Pass => pass
      case Quit => quit(command)
      case Create => create(command)
      case _ => ()
    }
  }
  
  def pass{
    for(yu <- yukkuries){
      yu.simulate
    }
  }
  
  def create(command:Command){
    Logger.debug("create")
    val yu = YukkuriFactory(ReimuSpecies)
    yukkuries.add(yu)
  }
  
  def quit(command:Command){
    Logger.debug("quit")
  }

}