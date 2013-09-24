package com.yanns.scala.example3

class UserRepository {

  def findUserByName(name: String): Option[User] = {
    name match {
      case "bob" => Some(User(name = "bob", gender = Some("M")))
      case "alice" => Some(User(name = "alice"))
      case _ => None
    }
  }

}
