object FoodClass extends App {


// define class with parameters
  class FoodClass (val foodName: String, var quantity: Int) {
    override def toString: String = s"THe food is $foodName and the quantity is $quantity"
  }



  // creating the objects of the food class

  val pizza = new FoodClass("Pizza", 5)
  val chicken = new FoodClass("Chicken", 3)

  // calling the toString method on the created objects
  println(pizza.toString)
  println(chicken.toString)



// accessing the values and reassigning the values to them.
  println(pizza.quantity)
  pizza.quantity= 10
  println(pizza.toString)





}
