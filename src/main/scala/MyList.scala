trait MyList[+A] {
  def head: A
  def tail: MyList[A]
}

case class MyCons[A] (
  def head: A = ???
  def tail: MyList[A] = ???
) extends MyList[A]

case object MyNil extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException("head of empty list")
  def tail: MyList[Nothing] = throw new UnsupportedOperationException("tail of empty list")
}
