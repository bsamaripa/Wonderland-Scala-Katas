addCommandAlias("AlphabetCipher", ";project AlphabetCipher;~test")
addCommandAlias("CardGameWar", ";project CardGameWar;~test")
addCommandAlias("Doublets", ";project Doublets;~test")
addCommandAlias("FoxGooseBagOfCorn", ";project FoxGooseBagOfCorn;~test")
addCommandAlias("MagicSquare", ";project MagicSquare;~test")
addCommandAlias("TinyMaze", ";project TinyMaze;~test")
addCommandAlias("WonderlandNumber", ";project WonderlandNumber;~test")

lazy val commonSettings = Seq(
  version := "1.1.0",

  scalaVersion := "2.12.3",

  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test",

  traceLevel := -1,

  logLevel := Level.Info,

  // disable printing timing information, but still print [success]
  showTiming := false,

  // disable printing a message indicating the success or failure of running a task
  showSuccess := false,

  // append -deprecation to the options passed to the Scala compiler
  scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature"),

  // disable updating dynamic revisions (including -SNAPSHOT versions)
  offline := true

)

lazy val AlphabetCipher = (project in file("AlphabetCipher")).
  settings(commonSettings: _*)

lazy val CardGameWar = (project in file("CardGameWar")).
  settings(commonSettings: _*)

lazy val Doublets = (project in file("Doublets")).
  settings(commonSettings: _*)

lazy val FoxGooseBagOfCorn = (project in file("FoxGooseBagOfCorn")).
  settings(commonSettings: _*)

lazy val MagicSquare = (project in file("MagicSquare")).
  settings(commonSettings: _*)

lazy val TinyMaze = (project in file("TinyMaze")).
  settings(commonSettings: _*)

lazy val WonderlandNumber = (project in file("WonderlandNumber")).
  settings(commonSettings: _*)
