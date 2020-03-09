import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._
import org.scalatest.Matchers._
import org.scalatest.matchers.should.Matchers
import org.scalactic.StringNormalizations._


class TuplesTesting extends FlatSpec {

 // val item1 = Tuple3("T-shirt", "Medium", 10.99)

  (Array("T-shirt", "Medium", 10.99) should contain allOf("T-shirt", "Medium", 10.99))

//  val item2 = Tuple3("Polo", "Medium", 4.99)
  (Array("Polo", "Medium", 4.99) should contain allOf("Polo", "Medium", 4.99))

  //  val item3 = Tuple3("Vest", "Medium", 5.99)
  (Array("Vest", "Medium", 5.99) should contain allOf("Vest", "Medium", 5.99))

//  val item4 = Tuple3("Jumper", "Large", 7.99)
  (Array("Jumper", "Large", 7.99) should contain allOf("Jumper", "Large", 7.99))

//  val item5 = Tuple3("Shirt", "Small", 13.99)

  (Array("Shirt", "Small", 13.99) should contain allOf("Shirt", "Small", 13.99))


}
