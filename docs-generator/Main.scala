package ${artifactPackage}.docs

import net.jackadull.jackadocs.execution.Jackadocs
import ${artifactPackage}.${infoObjectName}
import ${artifactPackage}.docs.readme.ReadmeRoot

import scala.language.postfixOps

object Main extends App {
  val jackadocs = Jackadocs fromArgs args

  jackadocs.requirePOMVersion("../pom.xml")(${infoObjectName} Version)

  jackadocs generateAt "../README.md" markdownFor ReadmeRoot
}
