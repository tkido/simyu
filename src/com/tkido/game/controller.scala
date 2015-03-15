package com.tkido.game

abstract class Controller {
  import com.tkido.tools.Logger
  
  def get() :Command = {
    var command:Option[Command] = None
    while(command.isEmpty){
      command = input()
    }
    Logger.debug( "command is -> "+ command.get)
    command.get
  }
  
  def input() :Option[Command]
  
}

class ConsoleController extends Controller{
  import com.tkido.tools.Logger
  
  def input() :Option[Command] = {
    val input = readLine("Input>")
    Logger.debug( "input is -> " + input)
    
    val command = input match {
      case "quit"   => Some(Quit)
      case "create"   => Some(Create)
      case _   => None
    }
    command
  }
  
}