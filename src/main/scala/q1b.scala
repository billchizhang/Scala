
import scala.util.parsing.combinator._


class q1b extends RegexParsers{



  val Tstart = "{{"
  val Tend = "}}"
  val Vstart = "{{{"
  val Vend = "}}}"
  val Dstart = "{"
  val Dend = "'}"
  val Pipe = "|"
  val Pipes = "||"

  val Outertext = ("[^("+Tstart+"|"+Dstart+")]+").r
  val Inneritext = ("[^("+Tstart+"|"+Dstart+"|"+Vstart+"|"+Pipe+"|"+Pipes+"|"+Tend+")]+").r
  val Innerdtext = ("[^("+Tstart+"|"+Dstart+"|"+Vstart+"|"+Pipe+"|"+Pipes+"|"+Dend+")]+").r
  val Bodytext = ("[^("+Tstart+"|"+Dstart+"|"+Vstart+"|"+Dend+")]+").r
  val Vname = ("[^("+Pipe+"|"+Pipes+"|"+Vend+")]+").r

  val p = new q1b()



}

