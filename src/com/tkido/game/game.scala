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
      case Pass   => pass
      case Quit   => quit(command)
      case Create => create(command)
      case Status => status
      case _ => ()
    }
  }
  
  def status{
    for(yukkuri <- yukkuries)
      View(yukkuri)
  }
  
  def pass{
    for(yukkuri <- yukkuries)
      yukkuri.simulate
    Clock.step
  }
  
  def create(command:Command){
    Logger.debug("create")
    val yukkuri = YukkuriFactory(ReimuSpecies)
    yukkuries.add(yukkuri)
    val yukkuri2 = YukkuriFactory(ReimuSpecies)
    yukkuri2.size = 0.16
    yukkuries.add(yukkuri2)
  }
  
  def quit(command:Command){
    Logger.debug("quit")
  }

}