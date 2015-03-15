package com.tkido.game

abstract class View {
  def show(event:Event)
}

class ConsoleView extends View{
  def show(event:Event) = {
    println(event.toString)
  }
}