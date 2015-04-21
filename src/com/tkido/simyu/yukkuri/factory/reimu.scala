package com.tkido.simyu.yukkuri.factory

import com.tkido.simyu.yukkuri._

object ReimuFactory {
  def apply(species:Species): Reimu = {
    new Reimu(species)
  }
}