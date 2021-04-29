package ${artifactPackage}.docs.readme

import net.jackadull.jackadocs.structure.Chapter
import ${artifactPackage}.${infoObjectName}

import scala.language.postfixOps

object DependencyManagementAndCompatibility extends Chapter {
  def id = "dependency-management-and-compatibility"
  def title = "Dependency Management and Compatibility"

  def contents =
<p>
  ${artifactIdWithoutScalaVersionCapitalized} is compatible with Scala ${version.language.scala.compat}.
  Best effort is made to always keep it up-to-date with the latest Scala version.
</p>
<p>
  Cross-versioning will not be supported.
  When a new Scala version is released, your code should be updated to that version as soon as possible anyways.
</p>

  override def subChapters = Seq(
    Chapter("sbt", "SBT",
<pre><code class="language-scala">
libraryDependencies += "net.jackadull" %% "${artifactIdWithoutScalaVersion}" % "{${infoObjectName} Version}"
</code></pre>
    ),
    Chapter("maven", "Maven",
<pre><code class="language-xml">
{<dependency>
  <groupId>net.jackadull</groupId>
  <artifactId>amazon</artifactId>
  <version>{${infoObjectName} Version}</version>
</dependency> toString}
</code></pre>
    )
  )

}
