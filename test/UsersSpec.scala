/*
package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import models._

class UsersSpec extends Specification {
  "User Model" should {
    "be get all users" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("helloworld"))) {
        val users = Users.get
        users.map { user =>
          user must haveKey('name)
          user must haveKey('message)
        }
      }
    }
  }
}
package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import models._

class UsersSpec extends Specification {
  "Users Model" should {

    "be get all users" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("helloworld"))) {
        val users = Users.get
        users.map { user =>
          user must haveKey('name)
          user must haveKey('message)
        }
      }
    }
  }
}
*/
import org.specs2._

class UsersSpec extends Specification {
  def is =
    "test test" ^
    "'hello world' string should" ^
    "contain 11 characters" ! e1^
    "start with 'hello'" ! e2^
    "end with 'world'" ! e3^
    end

  def e1 = "hello world" must have size(11)
  def e2 = "hello world" must startWith("hello")
  def e3 = "hello world" must endWith("world")
}
