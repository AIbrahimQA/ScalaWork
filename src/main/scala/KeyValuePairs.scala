import scala.collection.mutable.TreeMap
import scala.collection.mutable
import scala.math.Ordering


object KeyValuePairs extends Ordering[String] {

  def main(args: Array[String]): Unit = {
    compare("Bugatti/Venom")
  }

  def compare(key1: String, key2: String) = key2.compareTo(key1)

  def compare(key: String) = {
    val list: Array[String] = key.split("/")
    list(1).compareTo(list(0))
  }



  val carToSpeed = TreeMap(
    ("Bugatti", 304),
    ("Venom", 301),
    ("Koenigsegg", 278),
  )(KeyValuePairs)
  println(s"Car to Speed in reverse order by name = ${carToSpeed.mkString(",")}")


}

