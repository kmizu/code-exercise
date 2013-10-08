organization := "com.github.kmizu.code_exercise"

name := "code-exercise"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.7" % "test",
  "org.scalatest" % "scalatest_2.10" % "2.0.RC1" % "test"
)

initialCommands in console += {
  Iterator("com.github.kmizu.code_exercise._").map("import "+).mkString("\n")
}
