package com.tkido.simyu.yukkuri

object YukkuriFactory{
  import com.tkido.simyu.yukkuri.factory._
  
  def apply(species:Species): Yukkuri = {
    species match {
      case ReimuSpecies => ReimuFactory(species)
    }
  }
}

