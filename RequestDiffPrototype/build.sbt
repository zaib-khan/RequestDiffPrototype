ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "RequestDiffPrototype"
  )


libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.13.10",
  "net.petitviolet" %% "generic-diff" % "0.6.0",
  "com.github.dwickern" %% "scala-nameof" % "4.0.0" % "provided"
)