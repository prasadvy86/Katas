name := "Katas"

organization := ""

version := "0.0.1"

scalaVersion := "2.11.1"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.2.0"
)

initialCommands := "import .katas._"
