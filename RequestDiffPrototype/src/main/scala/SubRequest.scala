import State.state

case class SubRequest(subRequestRef: String, createdAt: Option[java.time.Instant], remarque: String, state: state)
