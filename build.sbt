scalaVersion := "2.10.3"

scalaSource <<= (baseDirectory) (_ / ".")

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5"
