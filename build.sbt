Compile / unmanagedResourceDirectories += baseDirectory.value / "database"
libraryDependencies += "dev.rolang" %% "dumbo" % "0.5.3"
scalaVersion := "3.5.2"
scalacOptions += "-Wunused:imports"
semanticdbEnabled := true