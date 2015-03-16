package com.tkido.simyu.yukkuri

object YukkuriFactory{
  def apply(species:Species): Yukkuri = {
    species match {
      case ReimuSpecies => ReimuFactory()
    }
  }
}

object ReimuFactory {
  def apply(): Reimu = {
    new Reimu()
  }
}