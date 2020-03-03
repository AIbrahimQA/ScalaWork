object PatternMatchingStrings extends App {

  val keyword: Any = "Hello"


  keyword match {
    case "Hello" =>   println("Hello".takeRight(3))
    case "wrong" => println(1)
    case _ => println("some other number")
  }
  println(s"the Keyword is $keyword")


}
