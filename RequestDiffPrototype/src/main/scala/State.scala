object State {
  trait state

  case class Open() extends state

  case class Closed() extends state

  case class Wip() extends state

  case class Error() extends state

}
