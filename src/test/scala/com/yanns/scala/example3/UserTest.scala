package com.yanns.scala.example3

import org.scalatest.{Matchers, WordSpec}
import org.joda.time.DateTime

class UserTest extends WordSpec with Matchers {

  "calculating the age of a person" when {
    "the date of birth is unknown" should {
      "not be possible" in {
        val johanna = User("Johanna", None, None)
        johanna.age shouldEqual None
      }
    }

    "the date of birth is known" should {
      "be calculated" in {
        val bob = User("Bob", None, Some(new DateTime().minusYears(25).toDate))
        bob.age shouldEqual Some(25)
      }
    }

  }

}
