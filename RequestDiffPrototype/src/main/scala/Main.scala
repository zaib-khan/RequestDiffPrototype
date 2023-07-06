import State._

object Main extends App {

  val subRequest1 = SubRequest("1", None, "test123", Open())
  val subRequest2 = SubRequest("2", None, "test123", Closed())
  val subRequest3 = SubRequest("3", None, "test123", Wip())
  val subRequest4 = SubRequest("4", None, "test123", Error())

  val requestOld =
    Request("45678", "8765.6789.8866", "Partena", "zaib", List(subRequest1, subRequest2, subRequest3), None)

  val requestChanged = Request(
    "45678",
    "8765.6789.8866",
    "Partena",
    "khan",
    List(subRequest1, subRequest2.copy(state = Error()), subRequest3),
    None
  )

}
