package com.tkido.game
import com.tkido.simyu._

abstract class View {
  def apply(event:Action)
}

class ConsoleView extends View{
  def apply(action:Action) = {
    println(action.toString)
  }
}

object View {
  val view = new ConsoleView()
  
  def apply(action:Action){
    view(action)
  }
}