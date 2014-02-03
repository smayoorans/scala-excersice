
def factorial(i : Int) : Int = {

  def fact(i : Int , accumulator : Int ) : Int = {
    if (i <= 1) accumulator
    else fact(i-1, i*accumulator)
  }
  fact(i, 1)

}


println("Factorial of 5 : " + factorial(5))

def countTo(n : Int) : Unit = {
  count(1)
  def count(i : Int) : Unit = {
    if (i <= n) {
      count(1+i)
      println(i)
    }
  }
}

countTo(5)