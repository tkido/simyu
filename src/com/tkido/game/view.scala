package com.tkido.game
import com.tkido.simyu._

abstract class View {
  def apply(any:Any)
}

class ConsoleView extends View{
  def apply(any:Any) = {
    any match{
      case GreetingAction(a) => println(a.label + "はあいさつをした。")
      case s:String => println(s)
      case _ => ()
    }
  }
}

object View {
  val view = new ConsoleView()
  
  def apply(any:Any){
    view(any)
  }
}