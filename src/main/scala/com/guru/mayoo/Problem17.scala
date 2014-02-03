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

def printNumber(number : Int) : String = {

  val strings = number match {
    case num if num <= 20 => numberString.get(num).get

    case num if num > 20 && num <= 99 =>
      val firstDigit = num.toString.charAt(0).toString.toInt
      val secondDigit = num.toString.charAt(1).toString.toInt
      secondDigitStrings(firstDigit)+" " +  numberString.get(secondDigit).getOrElse("")

    case num if num >= 100 && num <= 999 =>
      val firstDigit = num.toString.charAt(0).toString.toInt
      val secondDigit = num.toString.charAt(1).toString.toInt
      val thirdDigit = num.toString.charAt(2).toString.toInt
      if (secondDigit == 1)  numberString.get(firstDigit).getOrElse("") + " hundred and "+  numberString.get((secondDigit.toString + thirdDigit.toString).toInt).getOrElse("")
      else  numberString.get(firstDigit).getOrElse("") + " hundred and " + secondDigitStrings(secondDigit)+" " +  numberString.get(thirdDigit).getOrElse("")
  }

  strings
}

for ( i <- 1 to 999) println( printNumber(i))



def secondDigitStrings(firstDigit : Int) : String = {
  firstDigit match {
    case 2 => "twenty"
    case 3 => "thirty"
    case 4 => "forty"
    case 5 => "fifty"
    case 6 => "sixty"
    case 7 => "seventy"
    case 8 => "eighty"
    case 9 => "ninity"
    case _ => ""
  }
}
