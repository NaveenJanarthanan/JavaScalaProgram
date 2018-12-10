package com.naveen.javascala

class DoStuff private[javascala] {

    def square( x:Int) : Int = {
      return x * x
    }

    def areaRectangle( a:Int, b:Int) : Int = {
      return a * b
    }

    def areaCircle( a:Double) : Double = {
      val ar = 3.14 * (a*a)
      return ar
    }

    def volumeSphere( a:Double) : Double = {
      val ar = (1.333333)*(3.14)*(a*a*a)
      return ar
    }
}
