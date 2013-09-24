package com.yanns.scala.example2

class IntegerService {
  def multiplyBy2(number: Int): Int = {
    number * 2
  }

  def multiplyUserInputBy2 {
    //val userInput: Int = null // does not compile
    //val userInput = Int.unbox(new Integer(null)) throws exception
    val userInput = 2
    multiplyBy2(userInput)
  }
}
