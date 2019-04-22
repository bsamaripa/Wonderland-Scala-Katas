addCommandAlias("AlphabetCipher", ";project AlphabetCipher;~test")
addCommandAlias("CardGameWar", ";project CardGameWar;~test")
addCommandAlias("Doublets", ";project Doublets;~test")
addCommandAlias("FoxGooseBagOfCorn", ";project FoxGooseBagOfCorn;~test")
addCommandAlias("MagicSquare", ";project MagicSquare;~test")
addCommandAlias("TinyMaze", ";project TinyMaze;~test")
addCommandAlias("WonderlandNumber", ";project WonderlandNumber;~test")

ThisBuild / version := "1.1.1"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / traceLevel := -1
ThisBuild / logLevel := Level.Info
ThisBuild / showTiming := false
ThisBuild / showSuccess := false
ThisBuild / scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")
ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

lazy val AlphabetCipher = project
lazy val CardGameWar = project
lazy val Doublets = project
lazy val FoxGooseBagOfCorn = project
lazy val MagicSquare = project
lazy val TinyMaze = project
lazy val WonderlandNumber = project