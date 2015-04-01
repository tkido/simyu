package com.tkido.game

abstract sealed class Command
abstract class SysCommand extends Command
abstract class AppCommand extends Command

case object Quit extends SysCommand

case object Pass extends AppCommand
case object Create extends AppCommand

