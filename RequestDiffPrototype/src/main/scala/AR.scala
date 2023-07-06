object AR {

  trait Command

  case class updateRequest() extends Command
  case class updateSubRequest() extends Command

}
