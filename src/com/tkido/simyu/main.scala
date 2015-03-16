package com.tkido.simyu

object main extends App {
  import com.tkido.game._
  import com.tkido.simyu.Config
  import com.tkido.tools.Logger
  import com.tkido.tools.Text
  
  Logger.level = Config.logLevel
  
  new Game(new ConsoleController(), new ConsoleView())

  Logger.close()
}