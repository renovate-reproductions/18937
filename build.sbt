name := "renovate-issue"

version := "0.1"

scalaVersion := "2.13.10"

val jacksonVersion = "2.13.4"
val jacksonDatabindVersion = "2.13.4.2"
val scalaTestPlusMockitoVersion = "3.2.14.0"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % jacksonVersion,
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion,
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-cbor" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % jacksonDatabindVersion,
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % jacksonVersion,
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % jacksonVersion,
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % jacksonVersion,
  "org.scalatestplus" %% "mockito-4-6" % scalaTestPlusMockitoVersion % "test"
)
