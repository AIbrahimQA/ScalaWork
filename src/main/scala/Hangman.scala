import scala.util.Random
import scala.io.StdIn._


object Hangman extends App {
  println("Welcome To The Best Hangman Game In The Internet")

  println(readUserInput())


  val list: List[String] = List("Football", "UFC", "Tennis", "Cricket", "Swimming", "Taekwondo", "Weightlifting")
  println(scala.util.Random.shuffle(list).head)

  def readUserInput(): Unit = {
    println("Please Enter your desired difficulty for this hangman game. EASY - MEDIUM - HARD")

  }

 // def underScores(): Unit = {
   // var hidden = list.replaceAll("[a-zA-Z]", "_")


  }

  def Split(word : String) : List[Char] = {
    word.toList
  }

  def Join(list : List[Char]) : String = {
    list.mkString(" ")
  }










}
