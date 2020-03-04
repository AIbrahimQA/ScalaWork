object FizzBuzz extends App {

  def result(number: Int) = {
    var answer = ""
    if (number % 3 == 0) answer = "Fizz"
    if (number % 5 == 0) answer += "Buzz"
    if (answer == "") number.toString
    else answer
  }
  println(result(15))

}
