package com.tkido.game

abstract class Controller {
  import com.tkido.tools.Logger
  
  def get() :Command = {
    @annotation.tailrec
    def loop() :Command = {
      input() match{
        case Some(c) => c
        case None => loop()
      }
    }
    loop()
  }
  
  def input() :Option[Command]
  
}

class ConsoleController extends Controller{
  import com.tkido.tools.Logger
  
  def input() :Option[Command] = {
    val input = readLine(">")
    Logger.debug(input)
    CommandParser(input)
  }
}

object CommandParser {
  def apply(arg:String) :Option[Command] = {
    arg.trim.stripLineEnd.toLowerCase match {
      case ""       => Some(Pass)
      case "quit"   => Some(Quit)
      case "create" => Some(Create)
      case "status" => Some(Status)
      case _   => None
    }
  }
}