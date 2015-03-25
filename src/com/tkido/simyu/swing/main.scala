package com.tkido.simyu.swing

import java.awt.Cursor

import scala.swing.Dimension
import scala.swing.MainFrame
import scala.swing.Menu
import scala.swing.MenuBar
import scala.swing.SimpleSwingApplication

import javax.imageio.ImageIO

object main extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "シムゆっくり"
    minimumSize = new Dimension( 800, 480 )
    cursor = new Cursor( Cursor.HAND_CURSOR )
    resizable = false
    //iconImage = ImageIO.read( getClass().getResourceAsStream( "icon.bmp" ) )
    menuBar = new MenuBar() {
      contents += new Menu( "ゆっくり" )
    }
  }
}

