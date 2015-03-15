package com.tkido.simyu.yukkuri

class Yukkuri(val name:String) {
  import com.tkido.game.View
  import com.tkido.simyu.event._
  
  def step{
    View(new Greeting("ゆっくりしていってね！！！"))
  }
}