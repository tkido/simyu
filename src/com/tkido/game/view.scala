package com.tkido.game
import com.tkido.simyu._

abstract class View {
  def apply(any:Any)
}

class ConsoleView extends View{
  def apply(any:Any) = {
    any match{
      case PassAction(a) => println(a.label + "はゆっくりしている。")
      case GreetingAction(a, t) => println(a.label + "は" + t.label + "にあいさつをした。")
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