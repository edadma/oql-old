//addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.8.0")
//addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
//addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")
//addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.0")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta37")

addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")

//resolvers += "edadma" at "https://maven.pkg.github.com/edadma/npm-plugin/io/github/edadma"
//resolvers += Resolver.githubPackages("edadma")
resolvers += Resolver.mavenLocal
addSbtPlugin("io.github.edadma" % "npm-plugin" % "0.1.14")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.9.2")
addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")
