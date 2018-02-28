object q1a extends App {


  val Outertext = "^([^\\{]|\\{(?!(\\{|\\')))+".r
  val Inneritext = "^([^\\{\\|\\}]|\\{(?!(\\{|\\'))|\\}(?!\\}))+".r
  val Innerdtext = "^([^\\{\\|\\']|\\{(?!(\\{|\\'))|\\'(?!\\}))+".r
  val Bodytext = "^([^\\{\\']|\\{(?!(\\{|\\'))|\\'(?!\\}))+".r
  val Vname = "^([^\\|\\}]|\\}(?!\\}(?!\\})))+".r

  println(Outertext.findAllIn("abadc{{{d{{aaefg").toList.toString())
  println(Inneritext.findAllIn("abcde{{abe{'abc{{{abc||abc}}").toList.toString())
  println(Innerdtext.findAllIn("abcde{{abe{'abc{{{abc||abc'}").toList.toString())
  println(Bodytext.findAllIn("abcde{{abe{'abe{{{abe'}").toList.toString())
  println(Vname.findAllIn("abcde||abe}}}abc").toList.toString())

}