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
  def getChangedPorpertiesNames(change: Request): Seq[String] = {
    this.diff(change).diffs.map(_.name)
  }

  def getOperation(property: String) = {
    // importante properties :
    val listOfSubRequest: String = nameOf(this.listOfSubRequest)
    property match {
      case `listOfSubRequest` => (listOfChangedSubRequest: List[SubRequest]) => {}
      case _                  => () => { println("no match") }
    }
  }
}
