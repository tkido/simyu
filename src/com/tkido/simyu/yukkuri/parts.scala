package com.tkido.simyu.yukkuri
import com.tkido.simyu.simulation._

abstract class Parts extends Physical with Organic {

}

class Core extends Parts


abstract class Ornament extends Parts{
  val name:String
}

class ReimuRibbon extends Ornament{
  val name = "おりぼん"
}
class MarisaHat extends Ornament{
  val name = "おぼうし"
}
