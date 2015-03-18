package com.tkido.game

abstract class Controller {
  import com.tkido.tools.Logger
  
  def get() :Command = {
    var command:Option[Command] = None
    while(command.isEmpty){
      command = input()
    }
    Logger.debug( "#command == "+ command.get)
    command.get
  }
  
  def input() :Option[Command]
  
}

class ConsoleController extends Controller{
  import com.tkido.tools.Logger
  
  def input() :Option[Command] = {
    val input = readLine(">")
    Logger.debug( "#input == " + input)
    
    CommandParser(input)
  }
}

object CommandParser {
  def apply(arg:String) :Option[Command] = {
    arg.trim.stripLineEnd.toLowerCase match {
      case "quit"   => Some(Quit)
      case "create"   => Some(Create)
      case _   => None
    }
  }
}