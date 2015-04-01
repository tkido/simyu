package com.tkido.simyu.yukkuri

object YukkuriFactory{
  def apply(species:Species): Yukkuri = {
    species match {
      case ReimuSpecies => ReimuFactory(species)
    }
  }
}

object ReimuFactory {
  def apply(species:Species): Reimu = {
    new Reimu(species)
  }
}