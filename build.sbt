organization := "com.github.kmizu.code_exercise"

name := "code-exercise"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.3"

testOptions += Tests.Argument(TestFrameworks.ScalaTest)

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.7" % "test"
)

initialCommands in console += {
  Iterator("com.github.kmizu.code_exercise._").map("import "+).mkString("\n")
}
