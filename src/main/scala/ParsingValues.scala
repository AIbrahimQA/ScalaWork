object ParsingValues extends App {

  val carTypeStr = "Astra Silver 2015"
  val splitStr = carTypeStr.split(" ")
  val car = splitStr(0)
  val colour = splitStr(1)
  val year = splitStr(2).toInt

  val carOutput =
    s"""
      |Car Model: $car
      |Car Colour: $colour
      |Year: $year
      """.stripMargin
  println(Console.BOLD)
  println(carOutput)
}

