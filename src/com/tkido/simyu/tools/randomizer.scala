package com.tkido.simyu.tools

object Randomizer {
  import java.util.UUID
  
  def newId:String =
    UUID.randomUUID().toString

}