package ${artifactPackage}.docs.readme

import net.jackadull.jackadocs.structure.Chapter

import scala.language.postfixOps

object ReadmeRoot extends Chapter {
  def id = "${artifactIdWithoutScalaVersion}"
  def title = "${artifactIdWithoutScalaVersionCapitalized}"

  def contents =
<p>
  debit
</p>

  override def subChapters = Seq(DependencyManagementAndCompatibility)
}
