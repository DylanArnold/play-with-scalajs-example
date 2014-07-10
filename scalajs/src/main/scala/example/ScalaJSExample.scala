package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import shared.SharedMessages

import scala.scalajs.js
import org.scalajs.dom.{HTMLInputElement, console, document, window, Node}

import japgolly.scalajs.react._
import vdom.ReactVDom._
import all._

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    //g.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks

    val HelloMessage = ReactComponentB[String]("HelloMessage")
      .render(name => div("Hello there ", name, cls:="someclass", id:="someid"))
      .create

    React.renderComponent(HelloMessage("John"), document getElementById "scalajsShoutOut")
    g.console.log(React.renderComponentToString(HelloMessage("John")))
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
