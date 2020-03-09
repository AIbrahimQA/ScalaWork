object FinalCaseClass extends App {

  final case class computerParts(name: String, price: Double, qty: Int)

  val computer1 = computerParts("Ryzen 7", 275, 1)
  val computer2 = computerParts("RAM", 75, 2)
  val computer3 = computerParts("Motherboard", 85, 1)
  val basket = List(computer1, computer2, computer3)



}
