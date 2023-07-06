import State.state
import com.github.dwickern.macros.NameOf.nameOf

case class SubRequest(subRequestRef: String, createdAt: Option[java.time.Instant], remarque: String, state: state){
  def getDifference(changedSubRequest : SubRequest) = {

  }

  def getChangeablePropertiesName(): List[String] = {
    List(nameOf(this.state))
  }
}
