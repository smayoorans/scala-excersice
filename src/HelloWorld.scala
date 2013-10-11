/**
 * Created with IntelliJ IDEA.
 * User: mayooran
 * Date: 10/11/13
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!") // prints Hello World
    square(4)
    addTwoNumbers(3,4);
  }

  def square(x: Double) = print (x * x)


  def addTwoNumbers(a : Int , b : Int) = {a + b }
}
