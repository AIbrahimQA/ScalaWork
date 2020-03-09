import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._


class ExpectedResults extends FlatSpec {

  val a = 5
  val b = 5
  assertResult(10) {

    a + b
  }


}
