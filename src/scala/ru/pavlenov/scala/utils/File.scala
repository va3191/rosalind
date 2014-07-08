package ru.pavlenov.scala.utils

import scala.io.Source

/**
 * ⓭ + 01
 * Какой сам? by Pavlenov Semen 05.07.14.
 */
object File {

  def getClassDir(clazz: Any) = System.getProperty("user.dir") + "/src/scala/" + clazz.getClass.getName.replaceAll("\\.", "/").replace("$", "")

  def fromData(clazz: Any) = Source.fromFile(getClassDir(clazz) + ".data").mkString

  def readFasta(clazz: Any) = {
    val header = """>(.+)(\|.+)?""".r
    var lines = Source.fromFile(getClassDir(clazz) + ".data").getLines().filterNot(_.isEmpty)
    var sequences = List[(String, String)]()
    while (lines.nonEmpty) {
      val header(name, annotation) = lines.next()
      val (seq, rest) = lines.span(_(0) != '>')
      sequences = (name, seq.mkString) :: sequences
      lines = rest
    }
    sequences.reverse
  }

}
