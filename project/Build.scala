import sbt._

/**
  * Created by wdaimongkol on 6/25/2017 AD.
  */
object NongpedPedAPIBuild extends Build {

  lazy val root = Project(
    id = "nongped-pull-api",
    base = file(".")) aggregate common dependsOn common

  lazy val common = Project(
    id = "nongped-pull-api-common",
    base = file("common"))
}

