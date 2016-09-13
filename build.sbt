name := "zpark-ztream"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.0",
  "org.apache.spark" % "spark-mllib_2.11" % "2.0.0",
  "org.scalaz.stream" %% "scalaz-stream" % "0.8",
  "nl.grons" %% "metrics-scala" % "3.5.5_a2.3",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xlog-implicits")

seq(bintraySettings:_*)

//seq(bintrayResolverSettings:_*)
