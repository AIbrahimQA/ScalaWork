object Tuples extends App {
  val item1 = Tuple3("T-shirt", "Medium", 10.99)
  val item2 = Tuple3("Polo", "Medium", 4.99)
  val item3 = Tuple3("Vest", "Medium", 5.99)
  val item4 = Tuple3("Jumper", "Large", 7.99)
  val item5 = Tuple3("Shirt", "Small", 13.99)


  val basket = List(item1, item2, item3, item4, item5)
  basket.foreach {
    case item if item._1 == "T-Shirt" =>
      println(s"${item._1.toUpperCase()} is priced at $$${item._3} for the ${item._2} size.")
    case item =>
      println(s"${item._1.toLowerCase()} is priced at $$${item._3} for the ${item._2} size.")
  }


}
