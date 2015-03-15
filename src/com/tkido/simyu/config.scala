package com.tkido.simyu

object Config {
  import com.tkido.tools.Properties
  
  private val prop = Properties("data/conf.properties")
  
  val logLevel = prop("logLevel").toInt
}