object CompanionObject {


  class Drink(var drinkName: String, val price: Double) {
    def printDrinkInfo(): Unit = {
      println(s"The drink is $drinkName and the price is £$price")
    }
  }


  class Apple(drinkName: String, price: Double)
    extends Drink(drinkName, price)

  class Orange(drinkName: String, price: Double) extends Drink(drinkName, price)

  object Drink {

    def apply(drinkName: String, price: Double): Drink = {

      drinkName match {

        case "Apple" => new Apple(drinkName, price)
        case "Orange" => new Orange(drinkName, price)
        case _ => new Drink(drinkName, price)
      }
    }
  }


  val orange = Drink("Orange", 2.55)
  val apple = Drink("Apple", 3.23)

  apple.printDrinkInfo()
  orange.printDrinkInfo()


  println(s"Orange is of the instance Orange: ${orange.isInstanceOf[Orange]}")

  println(s"Apple is of the instance Apple: ${apple.isInstanceOf[Apple]}")



}
