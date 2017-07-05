import sbt._

/**
  * Created by wdaimongkol on 6/25/2017 AD.
  */
object NongpedPedAPIBuild extends Build {

  lazy val root = Project(
    id = "nongped-pull-api-root",
    base = file(".")).aggregate(common, api).dependsOn(common, api)

  lazy val common = Project(
    id = "nongped-pull-api-common",
    base = file("common")
  )

  lazy val api = Project(
    id = "nongped-pull-api-route",
    base = file("api")
  )
}

