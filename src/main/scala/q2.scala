import scala.util.parsing.combinator._

abstract class ASTNode
case class ASTLetter(val value:Char) extends ASTNode
case class ASTSymbol(val op:Char, val left:ASTNode, val right:ASTNode) extends ASTNode

object q2 extends RegexParsers {
  //constant terminals
  val Tstart = "{{"
  val Tend = "}}"
  val Vstart = "{{{"
  val Vend = "}}}"
  val Dstart = "{'"
  val Dend = "'}"
  val Pipe = "|"
  val Pipes = "||"
  //non-terminals
  val Outertext = "^([^\\{]|\\{(?!(\\{|\\')))+".r
  val Inneritext = "^([^\\{\\|\\}]|\\{(?!(\\{|\\'))|\\}(?!\\}))+".r
  val Innerdtext = "^([^\\{\\|\\']|\\{(?!(\\{|\\'))|\\'(?!\\}))+".r
  val Bodytext = "^([^\\{\\']|\\{(?!(\\{|\\'))|\\'(?!\\}))+".r
  val Vname = "^([^\\|\\}]|\\}(?!\\}(?!\\})))+".r
}
