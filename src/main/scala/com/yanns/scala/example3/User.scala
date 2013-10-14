package com.yanns.scala.example3

import java.util.Date
import org.joda.time.{DateTime, Years}

case class User (
  name: String,
  gender: Option[String] = None,
  dateOfBirth: Option[Date] = None
) {

  def age: Option[Int] =
    dateOfBirth.map { dob => calculateAge(dob) }

  private def calculateAge(dateOfBirth: Date): Int = {
    val dob = new DateTime(dateOfBirth)
    val now = new DateTime()
    Years.yearsBetween(dob, now).getYears
  }
}
