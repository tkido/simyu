package com.tkido.game

abstract class Command
abstract class SysCommand extends Command
abstract class AppCommand extends Command

case object Quit extends SysCommand

case object Create extends AppCommand

