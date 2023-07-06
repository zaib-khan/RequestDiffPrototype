import AR.Command
import net.petitviolet.generic.diff._
import com.github.dwickern.macros.NameOf._
case class Request(
    icRef: String,
    nationalNumber: String,
    assurability: String,
    coordination: String,
    listOfSubRequest: List[SubRequest],
    aquit: Option[Boolean]
) {
  private def getChangedPropertiesNames(change: Request): Seq[String] = {
    this.diff(change).diffs.map(_.name)
  }
  private def getChangeablePropertiesName() : List[String] = {
    List(nameOf(this.listOfSubRequest))
  }

  private def manager(property: String) = { // not sure about the name

    property match {
      case propertyName:String if getChangeablePropertiesName().contains(propertyName) => ???
      case propertyName:String if getChangeablePropertiesName().contains(propertyName) => ???
      case _                  =>
    }
  }

/*  def getListOfCommandToRun(changedRequest: Request): List[Command] = {
    val changedPropertiesNames = getChangedPropertiesNames(changedRequest)
    val temp = changedPropertiesNames.map(x => manager(x))

    ???
  }*/
def getListOfCommandToRun(changedRequest: Request) = {
  val changedPropertiesNames = getChangedPropertiesNames(changedRequest)
  val temp = changedPropertiesNames.map(x => manager(x))
}

}
