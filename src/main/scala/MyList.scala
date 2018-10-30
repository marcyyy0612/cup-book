trait MyList[+A] {
  def head: A
  def tail: MyList[A]
}

case class MyCons[A](
  ???
) extends MyList[A]

case object MyNil extends MyList[???] {
  ???
}
