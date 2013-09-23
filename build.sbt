name := "scala-techtalk"

version := "0.1.0-SNAPSHOT"

organization := "com.yanns"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-Xmax-classfile-name", "128")

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases")


