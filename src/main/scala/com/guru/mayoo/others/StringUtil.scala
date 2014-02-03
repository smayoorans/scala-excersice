
object StringUtil {

  def joiner(strings : List[String], separator : String) :String =
    strings.mkString(separator)

  def joiner(strings : List[String]) :String = joiner(strings, " ")


  def joinerOpti(strings : List[String], separator : String = " ") :String =
    strings.mkString(separator)
}

import StringUtil._

println(joiner(List("Programming", "Scala")))

println(joiner(List("Programming","Java"), "_"))

println(joinerOpti(List("Programming","Python")))