name := "scala-techtalk"

version := "0.1.0-SNAPSHOT"

organization := "com.yanns"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-Xmax-classfile-name", "128")

libraryDependencies += "joda-time" % "joda-time" % "2.3"

libraryDependencies += "org.joda" % "joda-convert" % "1.5"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.RC2" % "test"
