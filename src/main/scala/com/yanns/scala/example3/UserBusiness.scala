package com.yanns.scala.example3

class UserBusiness {

  val userRepository = new UserRepository()

  def isUserAllowed(name: String): Boolean = {

    val allowedUser = for {
      user <- userRepository.findUserByName(name)
      gender <- user.gender
      if gender == "F"
      age <- user.age
      if age >= 18
    } yield user

    allowedUser.isDefined
  }

}
