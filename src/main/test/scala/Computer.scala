import org.scalatest._
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.{FeatureSpec, GivenWhenThen}

class Computer {

  private var on: Boolean = false

  def isOn: Boolean = on

  def pressPowerButton(): Unit = on = !on
}

class ComputerTest extends FeatureSpec with GivenWhenThen {

  Feature("Computer power button") {
    Scenario("User presses power button to turn computer on") {

      Given("a computer is Off")
      val computer = new Computer
      assert(!computer.isOn)

      When("the power button is pressed")
      computer.pressPowerButton()

      Then("the computer should switch on")
      assert(computer.isOn)

    }

  }
}
