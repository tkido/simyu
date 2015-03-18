package com.tkido.simyu.yukkuri
import com.tkido.simyu.simulation._
import com.tkido.tools.Logger
import java.util.UUID

abstract class Parts extends Physical with Organic {

}

class Core extends Parts{
  
}


abstract class Ornament(val id:String) extends Parts{
  val name:String
}

class ReimuRibbon(id:String) extends Ornament(id){
  val name = "おりぼん"
}
class MarisaHat(id:String) extends Ornament(id){
  val name = "おぼうし"
}
