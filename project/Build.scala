import sbt._
import Keys._

object NongpedPedAPIBuild extends Build {

  import Dependencies._
  import BuildSettings._

  lazy val root = Project(
    id = "nongped-pull-api",
    base = file("."),
    settings = buildSettings ++ Seq(libraryDependencies ++= Seq(
      scalaTest
    )))
    .aggregate(common, api)
    .dependsOn(common, api)

  lazy val common = Project(
    id = "nongped-pull-api-common",
    base = file("common"),
    settings = buildSettings
  )

  lazy val api = Project(
    id = "nongped-pull-api-route",
    base = file("api"),
    settings = buildSettings
  )
}


object Dependencies {
  val scalaTest = "org.specs2" %% "specs2-core" % "3.9.1" % "test"
}

object BuildSettings {

  val buildOrganization = "org.worasit"
  val buildVersion = "1.0"
  val buildScalaVersion = "2.12.1"

  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := buildOrganization,
    version := buildVersion,
    scalaVersion := buildScalaVersion
  )

}
