object Intersects extends App {

  val computer1 = Set("Ryzen", "B450", "16GB RAM", "RTX 2060")
  val computer2 = Set("Ryzen", "A320", "16GB RAM", "RTX 2080")

  val relatedParts = computer1 intersect computer2
  println(
    s"""
       |Computer 1 = ${computer1.mkString(" - ")}
       |Computer 2 = ${computer2.mkString(" - ")}
       |Common Parts are:
       |""".stripMargin
  )


  relatedParts.foreach(item => println(item.toUpperCase()))
}

