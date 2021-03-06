package ru.pavlenov.scala.homework.coursera

import ru.pavlenov.scala.libs.peptide.Peptide
import ru.pavlenov.scala.utils.File

import scala.concurrent.JavaConversions._

/**
 * ⓭ + 58
 * Какой сам? by Pavlenov Semen 21.10.14.
 * Cyclopeptide Scoring Problem: Compute the score of a cyclic peptide against a spectrum.
 * https://stepic.org/lesson/Mass-Spectrometry-Meets-Golf-102/step/3?course=Bioinformatics-Algorithms&unit=423
 *
 * Given:
 * An amino acid string Peptide and a collection of integers Spectrum. 
 *
 * Return:
 * The score of Peptide against Spectrum, Score(Peptide, Spectrum).
 */

object Step2_7_3 {

  def start() {

    println("Cyclopeptide Scoring Problem: Compute the score of a cyclic peptide against a spectrum.")
    println("from https://stepic.org/lesson/Mass-Spectrometry-Meets-Golf-102/step/3?course=Bioinformatics-Algorithms&unit=423")
    println("==========================")

    val data = File.fromData(this)

    val text = data(0)
    val expSpectrum = data(1).split(" ").map(_.toInt)

    val peptide = Peptide(text)

//    println(peptide.cyclospectrum)

    println(peptide.score(expSpectrum))

  }

}