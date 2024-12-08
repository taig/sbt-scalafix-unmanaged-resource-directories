package reproducer

import dumbo.ResourceFilePath

object App:
  @main
  def run: Unit = {
    val migrations = ResourceFilePath.fromResourcesDir("migration")
    println(migrations)
  }