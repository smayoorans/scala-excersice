import sbt._
import Keys._

object ScalaBuild extends Build {
  import BuildSettings._

  lazy val scalaWeb = Project (
    "Excersice",
    file ("."),
    settings = buildSettings
  )

  object BuildSettings {
    val buildSettings = Defaults.defaultSettings ++ Seq (
      organization := "Scala-Excersice",
      version      := "1.0.1",
      scalaVersion := "2.10.2"
    )
  }


}