package typeclass.syntax

import typeclass.Monoid

object monoid {
  implicit class MonoidOps[A](a: A)(implicit A: Monoid[A]){
    def isEmpty: Boolean = ???
    def ifEmpty[B](t: => B)(f: => B): B = ???
  }
}


