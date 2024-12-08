# sbt-scalafix with `unmanagedResourceDirectories`

```shell
> sbt run
// List(/migration/V1__initial.sql)
```

```shell
> sbt ";clean;scalafix RemoveUnused"
[error] -- Error: [...]/reproducer/src/main/scala/reproducer/App.scala:8:54 
[error] 8 |    val migrations = ResourceFilePath.fromResourcesDir("migration")
[error]   |                     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
[error]   |                     resource migration was not found
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
```