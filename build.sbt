addCommandAlias("follow-the-white-rabbit", "~test-only org.wonderlandkatas.forscala.Katas")

lazy val commonSettings = Seq(
  version := "1.0",

	scalaVersion := "2.11.7",

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

lazy val AlphabetCipher = project in file("AlphabetCipher")

lazy val CardGameWar = project in file("CardGameWar")

lazy val Doublets = project in file("Doublets")

lazy val FoxGooseBagOfCorn = project in file("FoxGooseBagOfCorn")

lazy val MagicSquare = project in file("MagicSquare")

lazy val TinyMaze = project in file("TinyMaze")

lazy val WonderlandNumber = project in file("WonderlandNumber")

libraryDependencies ++= Seq(
	"org.scalatest" % "scalatest_2.11" % "2.2.5" % "test" withSources() withJavadoc()
)
