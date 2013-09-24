package com.yanns.scala.example3

import java.util.{Calendar, Date}

case class User (
  name: String,
  gender: Option[String] = None,
  dateOfBirth: Option[Date] = None
) {

  def age: Option[Int] = {
    dateOfBirth.map { dob =>
      val now = new Date()
      val difference = now.getTime - dob.getTime
      val yearCalculator = Calendar.getInstance()
      yearCalculator.setTimeInMillis(difference)
      yearCalculator.get(Calendar.YEAR)
    }
  }
}
