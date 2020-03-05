import scala.io.StdIn._

object UserInput extends App {


  val name = readLine("Please Enter your name: ")
  println("Please Enter your age: ")
  val age = readInt()
  println(Console.BOLD)
  print("Name: ")
  print(Console.UNDERLINED)
  print(name)
  println(Console.BOLD)
  print("Age: ")
  print(Console.RESET)
  print(age)


}
