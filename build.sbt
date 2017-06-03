name := "Testing"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.2.6" % Test,
  "org.mockito" % "mockito-all" % "1.9.5" % Test,
  "org.scalacheck" % "scalacheck_sjs0.6_2.10" % "1.12.6" % Test,
  "org.scalamock" % "scalamock-scalatest-support_2.10" % "3.5.0",
  "org.zkoss.theme" % "breeze" % "5.0.9")
    