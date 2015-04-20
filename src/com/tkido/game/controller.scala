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
