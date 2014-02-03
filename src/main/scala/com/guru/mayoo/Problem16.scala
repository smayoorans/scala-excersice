val sum: Int = BigInt(2).pow(1000).toString().map(_.asDigit).sum
println("Sum of the digits of the number 2^1000:" + sum)
