object PatternMatchingOperators extends App {



  val operation: Any = "Subtraction"

  operation match {
    case "Addition" => println(3 + 2)
    case "Subtraction" => println(6-2)
    case _ => println("some other number")
  }
  println(s"The Operator is $operation")



}
