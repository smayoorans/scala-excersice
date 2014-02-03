val numberString = Map(1 -> "one",
                  2 -> "two",
                  3 -> "three",
                  4 -> "four",
                  5 -> "five",
                  6 -> "six",
                  7 -> "seven",
                  8 -> "eight",
                  9 -> "nine",
                  10 -> "ten",
                  11 -> "eleven",
                  12 -> "twelve",
                  13 -> "thirteen",
                  14 -> "fourteen",
                  15 -> "fifteen",
                  16 -> "sixteen",
                  17 -> "seventeen",
                  18 -> "eighteen",
                  19 -> "nineteen",
                  20 -> "twenty",
                  100 -> "hundred",
                  1000 -> "thousand")

def printNumber(number : Int) = {

  val strings = number match {
    case num if num <= 20 => numberString.get(num).get
    case num if num > 20 && num < 99 =>
      val firstDigit = num.toString.charAt(0).toString.toInt
      val secondDigit = num.toString.charAt(1).toString.toInt
      twoDigitPrefix()

      firstDigit + " " + numberString.get(secondDigit).getOrElse("Number not valid")
  }
  if(number <= 20) println(numberString.get(number).getOrElse("Number not valid"))
  println("35=======> " + strings)
}

def twoDigitPrefix() = {
  firstDigit match {
    case 3 => "thirty"
    case 4 => "forty"
    case 5 => "fifty"
    case _ => "sixty"
  }
}

printNumber(35)
