import java.util


// TODO
// Rock, Paper, Scissors, Lizard, Spock
//Functionality: PLayer vs AI
//Rock crushes scissors , rock crushes lizard
//Paper covers rock, paper disproves spock
//Scissors cuts paper, scissors decapitates lizard
//Spock smashes scissors, spock vaporizes rock
//Lizard eats paper , lizard poisons spock

object RockPaperScissorsLizardSpock{
  import scala.collection.mutable.LinkedHashMap


  welcome()

  def welcome() {

    val welcome = "Welcome to Rock, Paper, Scissors, Lizard, Spock"
    val rules = "The ways this game can be won are bellow"
    val waysToWin =
      """
        |Rock crushes scissors , rock crushes lizard
        |Paper covers rock, paper disproves spock
        |Scissors cuts paper, scissors decapitates lizard
        |Spock smashes scissors, spock vaporizes rock
        |Lizard eats paper , lizard poisons spock
      """.stripMargin
    println(Console.BOLD)
    println(welcome)
    println(Console.BOLD)
    println(rules)
    println(Console.BOLD)
    println(waysToWin)

  }


  def choice1(): Unit ={
    val rock = "Rock"
    val paper = "Paper"
    val scissors = "Scissors"

    val choice = List(rock,paper,scissors)
  }






}
