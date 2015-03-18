package com.tkido.game
import com.tkido.simyu._

abstract class View {
  def apply(event:Action)
}

class ConsoleView extends View{
  import com.tkido.simyu.event._
  
  def apply(action:Action) = {
    println(action.toString)
  }
}

object View {
  import com.tkido.simyu.event._
  
  val view = new ConsoleView()
  
  def apply(action:Action){
    view(action)
  }
}