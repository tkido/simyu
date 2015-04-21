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
      case Pass =>
        for(yu <- yukkuries)
          yu.simulate
      case Quit =>
        Logger.debug("quit")
      case Create =>
        val yu = YukkuriFactory(ReimuSpecies)
        yukkuries.add(yu)
      case Status =>
        for(yu <- yukkuries)
          View(yu.toString)
      case _ =>
        Logger.fatal("MUST NOT HAPPEN!!")
    }
  }
  
}