package com.tkido.simyu.tools

object Clock {
  import java.text.SimpleDateFormat
  import java.util.Calendar
  import java.util.Date
  
  val dateFormat = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm");
  val cal = Calendar.getInstance;
  cal.setTime(new Date)
  
  def step{
    cal.add(Calendar.MINUTE, +1)
  }
  
  override def toString():String =
    dateFormat.format(cal.getTime)
  
}