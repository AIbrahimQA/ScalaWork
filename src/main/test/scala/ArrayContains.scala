import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._
import org.scalatest.Matchers._
import org.scalatest.matchers.should.Matchers
import org.scalactic.StringNormalizations._

//testing intersects file.
class ArrayContains extends FlatSpec {

  // testing computer1 val

  (Array("Ryzen", "B450", "16GB RAM", "RTX 2060") should contain allOf("Ryzen", "B450", "16GB RAM", "RTX 2060")) (after being lowerCased)

  // testing computer2 val
  (Array("Ryzen", "A320", "16GB RAM", "RTX 2080") should contain allOf("Ryzen", "A320", "16GB RAM", "RTX 2080")) (after being lowerCased)

}