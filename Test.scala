import org.mockito.Mockito._

class Test extends PartialFunction[Any, Any] {
  def isDefinedAt(arg: Any): Boolean = false
  def apply(arg: Any): Any = ???
}

object Test extends App {
  val p1: PartialFunction[Any, Any] = { case _ => "" }
  val p2 = mock(classOf[Test])
  val ok = p1 orElse p2
  assert(ok != null)
  val err = p2 orElse p1
  assert(err != null)
}
