val numberString = Map(
                  1 -> "one",
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
                  19 -> "nineteen")

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



def countPlaces(number : Int) = {

  val noOfHundreds = number / 100
  val noOfTens = (number % 100) / 10
  val noOfOnes = number % 10
  (noOfHundreds, noOfTens , noOfOnes)
}

println( printInWords(789))

def printInWords(num : Int) = {

  val (h, t, o) = countPlaces(num)

  val strings = numberString.get(h).get + " hundred and " + secondDigitStrings(t) + " " + numberString.get(o).get

  strings
}




