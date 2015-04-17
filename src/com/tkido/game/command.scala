package com.tkido.game

abstract sealed class Command
abstract class SysCommand extends Command
abstract class AppCommand extends Command

case object Quit extends SysCommand

case object Pass extends AppCommand
case object Create extends AppCommand
case object Status extends AppCommand



object CommandParser {
  def apply(arg:String) :Option[Command] = {
    arg.trim.stripLineEnd.toLowerCase match {
      case ""       => Some(Pass)
      case "quit"   => Some(Quit)
      case "create" => Some(Create)
      case "status" => Some(Status)
      case "s"      => Some(Status)
      case _        => None
    }
  }
}