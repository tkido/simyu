package com.tkido.game

abstract class View {
  import com.tkido.simyu.event._
  
  def show(event:Event)
}

class ConsoleView extends View{
  import com.tkido.simyu.event._
  
  def show(event:Event) = {
    println(event.toString)
  }
}

object View {
  import com.tkido.simyu.event._
  
  val view = new ConsoleView()
  
  def apply(event:Event){
    view.show(event)
  }
}