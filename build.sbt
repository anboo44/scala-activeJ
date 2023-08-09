//~~~> Common info
ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "com.uet"
ThisBuild / organizationName := "storm.spirit"

//~~~> Root module
lazy val root = (project in file("."))
  .settings(
    name := "scala-activej",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.4.8",
      "io.activej" % "activej-launchers-http" % "5.5"
    )
  )
