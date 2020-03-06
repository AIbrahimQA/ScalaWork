object MultipleConstructors extends App {

  class Drink(drinkName: String, description: String, quantity: Int) {
    def this(drinkName: String) = this(drinkName, "", 2)

    def this(drinkName: String, description: String) = this(drinkName, description, 3)

    override def toString: String = "%s drink %s, quantity %s" format(drinkName, description, quantity)
  }

  // pass drink but not description parameter
  val appleDrinkWithTypeOnly = new Drink("Apple")
  println(appleDrinkWithTypeOnly.toString)
  // pass both drink and description parameters
  val appleDrinkWithTypeAndDescription = new Drink("Apple", "from 100% concentrate")
  println(appleDrinkWithTypeAndDescription.toString)

}



