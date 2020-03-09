import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._


class ExpectedResults extends FlatSpec {

  val a = 2
  val b = 3
  assertResult(10) {

    a + b
  }


}
