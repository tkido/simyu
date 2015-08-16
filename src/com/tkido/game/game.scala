package com.tkido.game

class Game(controller:Controller, view:View) {
  import com.tkido.tools.Logger
  import com.tkido.simyu.tools.Clock
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
    View(Clock)
    command match {
      case Pass =>
        for(i <- 1 to 1){
          Clock.step
          for(yu <- yukkuries)
            yu.simulate
        }
      case Quit =>
        Logger.debug("quit")
      case Create =>
        val yu = YukkuriFactory(ReimuSpecies)
        yu.setSize(1.0)
        yukkuries.add(yu)
        val yu2 = YukkuriFactory(ReimuSpecies)
        yu2.setSize(0.13)
        yukkuries.add(yu2)
      case Status =>
        for(yu <- yukkuries)
          View(yu.toString)
      case _ =>
        Logger.fatal("MUST NOT HAPPEN!!")
    }
  }
}