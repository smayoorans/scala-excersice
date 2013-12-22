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
    val buildOrganization = "odp"
    val buildVersion      = "2.0.29"
    val buildScalaVersion = "2.10.2"

    val buildSettings = Defaults.defaultSettings ++ Seq (
      organization := buildOrganization,
      version      := buildVersion,
      scalaVersion := buildScalaVersion
    )
  }


}