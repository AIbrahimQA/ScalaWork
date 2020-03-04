object PatternMatching extends App {



  var num1 = 2
  var num2 = 6
  var result = num1 + num2
  val answer: Any = result

  answer match {
    case result => println(result)
    case "wrong" => println(1)
    case _ => println("some other number")
  }
  println(s"the answer is $answer")



}
