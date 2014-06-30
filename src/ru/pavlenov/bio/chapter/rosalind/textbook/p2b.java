package ru.pavlenov.bio.chapter.rosalind.textbook;

import ru.pavlenov.bio.amino.Peptide;
import ru.pavlenov.bio.amino.RNA;
import ru.pavlenov.bio.genome.DNA;
import ru.pavlenov.bio.utils.Dump;

import java.util.ArrayList;

/**
 * Created by laser13 on 23.06.14.
 *
 * Peptide Encoding Problem
 * http://rosalind.info/problems/2b/
 */
public class p2b {

    public static void start() {

        String text = "CAGTCCCTAGAAGGGTTAAACTTCCCCGCCGGCAACTGTCGTGTCATTTCACTCTTCGCACAGTGTATTGTTGTCCCATTCGGTTCGGCATTACCAGCGCACCCGGATTATGCCCGTGCATAACCGCTTAACTGTCACCAGGGGCATCGCACGCAGACCGTGTTCACACGTCTCGCTGGGACGGCCTTCCTCCAACTCGCAGCGCAGCACAGCGGGTTCACCGTGGAGCCCGAAGTGTAATACCTTGGCTGCGTGGCCGAACCGGTCTACGCTTCCCAGACGCCCTCGTGACGCAAGAAGTGTGCAAAAACGTCTCCTGCAGTTCCTCCATGAACAATCAAATGGGTACATTGGTTGCTATTGTTGCAGACGATGGTCCTGAATTCACTCTGCCGGCAGTGTCAGGAAACAACAATGCAACGTAAAGGTGAACCGTATTTGTACGGTAAAGGACCGAAGTTCCCATAGAGAATACTAGACAACAAGGGCGGGTATTAATCGTTATCGTAGCGCTTGCGAAGGTTGAGAGTTTCAACCGGCGGTAATCCGAGACGGAGGGCTCAACCCGGAACTATTCGGTACGGAATACTTGGCGGAGAACCGGATGTACCCACTCTGAGCGCGGACACCAGGATGCGTTGTTTGAGTATCACGTACATGCCGTAAAAGTCTGGACGTTCGTGATGATAAGAGACAAAGATTCCTGCAAGACTTCCGCCATAACGTGGAGATCTGAGTTCTGCCTTAGCATTCTGGACTTTCTTCTATCTGCGCTGCCAAATGGTACGACTATGCATTGCTCAACGCTCTTCCTCCGGCGTCAACCCTATTAACAAACAGTGCATCGTGGTGCCGTTCGGCTCCGCCATACACTGCTCCGTGGTCTTAGATATAGATAACGATCGGTACTCTTTCTCCATTGTACTTTTAGATCTCAAAGAAACGACTAGCGCAATATATATATGTTCCAGACCGCTTTTCCACCAGCCAGGTTAATTCGGTTTCTTGATGGGTATACATTATTGTATCGGTCTAACCGATGTGCGGGGTATTGACTACAATAGAGTAGGAGGGACAGATTTTGCTACTACCGTGTACTCCTGACGTGTATGCTCAGGGAACGATGAACGGCAGAACATCTGCCCAATGTATCGTGGTTCCTTTCGGTTCCGCCCCGCGTAGAGACCTTAGTACGCGTTTTACTTTTCCACCCCTAACCGACTGGTTCTACGCAAAGTATCCGGTCGATAATAGAATGGCTGTAGCTGATATCGCTGCTGTATGGTTTTTTGTAAATACTGATTTTGGACATTTAAAACCAGCAGAACCCAGTCCGTTAGAGTGAGCGTGCTTAAGGTCTTTAGTAGTTCCGACTTCGTCCGGCTTACGCGATTGATTTCGCCACGAACTAGCCTATCAACTCTGCAAATATAAGTGCCAATCCCCGACCTGTCACTTTCGGGTCTACATCCCTCTGAATGGCAGTCACGACCCGACTCTGGGGCTAATGCCCGTGGCACACACGCAGTGTTCTGCCTCGTCGCATTAACGTACGATGGACGTGTTCTTGAGCGGCACTGGGAACCATCCTAGCAGCCCAGACTTGCACAATGAAGTTAAGGCGCACACCAGATAGAACGGAGGCAAAAGCCGCGGCACCCATTCGCTGAAGTGGGTAAAGGCGGGTGTAAGGGTTCCAGCATAAATAGGGAGAAGTCCGGACGAACTCCCATCCAAATACCCGTAAAAACCCGTGTAGATTTTCCTGTATAATGAATGCTTAGACGTTACCACAGAGGCATGCTAAGTTGCTCTCGAAAGCAGATCCGAAGGGTACCACGATACATTGTGGGTAGAGGTGGACCCTTCAGTCCATCTTTCTCTACCCCATTTCGTTTCGGGATTCACCATCTAGGGCAATTTTTGGGAACTCACATTGCGCTGAACTGATCCGTATCAACACTTGTAAGCGTTGCTTCCGAACACATACGTTAGCACTTCCGAAGGGGACAACGATACATTGTGGGATCAACAGCGGCTCGTCAGTGGTCCCTGCCGTTCGTCGACAGGCCAAGTTCGTTTAATTGTTGGGATAACTGACGTACTTGGGATGCCAAGGCGACAGAGCCTGTGCATAAAAGCGCTCACAAAGCGTTCCTCGAGAAGAAAATTTGGCGACCGACGACAATCCGTTTTTGTTTTGATGGTGACACCGCGCGTACCAAGCTCGAGTGGTTGTCGGGCCACACCGTCTATTAAGGGTTCTGCAGTTATGAGGTCCGCAGTTAGGGAAAGCTCTCCTTTTATAACAAACACGCCAAGCTACATAATGTGGCTGGCAAGTGGCGCCCCCGCGTAGAGGGGTAAATTCACAGTTCGTCGGCAATCACCCCGGCTGGGGGAGTCGAATGATTACAATGATTAAGTGTCTTAATGACGTGAGCTTACCCAAAATGAATAGCTGATGCGGCAAAGTAACGCGCGGTTCCAAGTAGTTGCCGCAATTTTTGACGTCGTTAATGGAAAGAGTCACATGTATGATTTCATTGTGAGGCAATCTTGGAATCTAATCTTCCGACCTAAAAGGTGTGATTTTGATTCAGTGGGTTGAAGCTCAGTAGCTGGGATTATCCACGCTAAAGCTCACTGTCTCCGGTCTGCTGGAAGCCCTAGTAGTATCACGCCCTCTTCCGTAGTTTCAGAAAGGCGCCGGTTCCCATGACGGTAAAAATGGCCAGGCGTTATACGTCCAGCTCGTAAGCTTTGAACGGCGGGTTGGTTCCCACCGATGCCCGTCCGGGCGGGACGCCAAGCGAAGTACGCAGTGTATAGTGGTACCCTTCGGGAGTGCTATTTTACGGACGCTCTCTAGTCCCAGATTTCATGATGATGCCCTTACAGCACAGCACGAGAAACTTCGGGTAGTACCTGCATGACTACTAATCCTCATCCTTTGAGTCACAGAGACGGGGGGGAAGAGGAGTAATTCTCTGGTTTTCTGCACTTCCAAAAGGAACCACAATACATTGAGGACTGTTTCTTTGAGGTTAGCGCGACGGAATTGTGGTAGGACAAGTCAAGAGCACATCATAAGCCTTACAATCGGTTGAATAGATTTGACGAAGTGCTGCCCGTACCACATCTGCTACGACACAATGTATAGTAGTTCCCTTCGGATCAGCGCCGGTGTTCTCACTTCTACAGTCACCTCAGCAGGCGCGAGAGGATATCAGCATAGCCACGTAAACTTAGTTATAGTGTCACCCTGCGGTACTTCATCTTCATTGTCCACGGTCAATCTAATTTCCAAGCGCTCGTAGCTCCTCGAGCTAAAATGGTCTGTGGCGCTTTCAACTCGCGGAATGCAAGGAAGCTGCTTGCGAGCCCTGTGTCCCCTCTTAAGCCAGATGCTCTGCAACGAACCGGAGGTGGCTGCTAATTGAGTATTGTCGGTACGTAGGGTATTCCCGGGCACAATGACTTATCAACAAACTCTTTAGCATGGGCAGTAGCCGGGGTAATAGGGCTCGGGTTAAAGGGGAGTATAAACAGCCGGGTGCGGTGATATTATTAAGAGAGGCAGTATTCACGGCAGAGGCGCCCGCTGATCAGCTTTAGCGTGAGCCGAGCTTTCGTGAGTTTGGTTGAGAGGTATACCTCGCGCGCCGGCGGGTTGCTTAAGCCAAATTTTAAAATTCGAGGACGAGCCGTAAATTTGTTCGAGACTTAGCGTAATATTTACATGTGCCGTCCCAACTTAACGGCGATTTACCCGGGGTCGACACATATACATATTTTTATTCCGAAAAGCGGCGGACCTTCCTACTATGGTTTAATCAGACTTCTTCCCTATTTTTCTGCCCGGAAAGACAGTCTCCGCTGACAGATATGGACACATCGCAACTGAGATACAATTGCGGAACGAACGTAGTCGGCTCAACGTTTATGAAAGGCTTAAACTGTACGTGGGGACGACTAACTAGGACGAAGTTTGGAGAGTTACCAAAGAACCTTTCATGATCTAAAGACGCTGATTGCTTGCTCCAAAGATTTCGTGACATTGATCGTATATTCATGGTGAGATTTTACCCAAGAGGGCTTTGTCTTGCGAGACATCTGAAGAATTGACGATAAATGGAACAACATCAATAGTCTGAGAATAAGATACAGCACATGTATTTTCTTTGCGCGCGAGAGTGTTTGACTTCGCTGCGCATGGGTGTGAAAAAACACAGTCGACAAGCGATGCTAATAACGCCAAATCGTCGGCGCCTTCCCCATGCACCCCTCAACGCTCGTCACCCTTTCGCTGGCACGGTGAGAGCGAATGGAGGGCGGGTTCATAGGAATATTACCGCTGTGGAATGACCCAACGGTACTATTCCTCTCAAGGAAGTGGAGTTCTCGGGGGATTATGTGATAGTTAGAACTGGAGTATCACATTTCTCTCAGGCATGAGACTCGCGGGGACGCGCTCCCAAAGGGCACCACTATACATTGAGCGCAATCCGCGCTGACCCGTGAATTTGACTGCGGACGCTCATTCCGTATTCGATACCGTTAATCTGGTGCCAATTAGCTCCAGTCTTCCTCTTAGTCTTACGAAATATTAGTATTTTAGCAGACAGAGGCCGCCGTCCTCATGTATGTACGGTCAGGAAGCCCGTAAATTGGGACACCACCAATGCATCGTTGTGCCATTTGGAAGTGCCATTCTGGTAATATCGAAACCGTTGCACATGGCTGAGGTAGTTACTTAGGCTTTGTGTTACGATGTGGTAAGGACTTGGAGATTTCCTTGGAATCACTTTGGCTTGCAGGGATAACGACTGCCGAGGTGAAAGGATACGCGAGCGCGTCGACGGTCACGCCGAACTCTCACCTGTGAGATCGCCGCCCGGAAAATTGCAATGCATAGTGGTTCCGTTTGGATCGGCTACTCTGCTAACACCTAGATTGTACGGTGCTGGACCAATGCTCCGTCCGCCTAAGTAGGGTCTACAGCGTCGTGATCCTGGATTCCTGCTAGTGCTGGGAGGCTCTTACCAAAGATACACGCAAACTACTGACCCCAGCAGTGTAGAGATCCCAATCGCGGGAGTCACCTCCGACATGTTCCCCAGGGATGCGTTACTGGAGTCTCCAACAATCTCCTCATCAGGTTTATACGGCCGCATCACGAGCTGCTTACAAATGGTCGACGCCTTGCACATGTCCGTACAAAATATTCTACTAATGCTTACCCGAAAATATCTAAGTTACCGCCCGTGTCGCCTCGTCGTTACGCGACCATTTACTATCCACTGTACAGAGCTAGGGTCGCTGGCATATAGTGTCATATCTAACCCCAACAGGGGTGGGAGTCGGAGTTTGACGACCGGGCAGACCCGAAGGGAACCACGATACACTGGGGGAGACCCTCAGCCGGAAGGAACACCTTACCAAAGAAGAACTAATCCAGTGCATTGTCGTACCCTTCGGGTCGGCCACAAAGACACTAAAGCAGATAAATGGCGGAGAGTCGGGATATGGGTAGTCCGACCGTCCATACTGTGATACATCCTGGTATAACAAGTTTGTGAGCACTTACTAGCGACCACTGATGGGGCGAGACCCAGGCGTTACGGGTAAGATGCATCGCGAAGGGTTGCGTTCCCCTGCCTTTACCAGCGTCCATCGTCGTGTTTTGCCGAACCAAAAGGTACCACGATACATTGCGTGACAATGTATTAATGACGTGGCTCTGTCAGATACGAGGCCTAAAAAGGACTATAGAGCTTTTTCCTAATCCCACGTCTTATATAGTGGCATTGTCGGACGGGGGCATGGCTTCCCTTAGGCAGGACAGGTCCCATAGACACGAAGGCAAGGTATCAATGGGTGTCACTGGACTACCGGTAGTTGGCGTATCAACAGCGGACCGATGCTACACTCAATGACAGCACAATCAGAGAGGATGTTGGCTGGGTGGGACGCGGGACAACGGTTAAGTCTCTTTGGCTGCCGGAGGGCCCCTCGTCGAAGGCCGCACAGGCAGAGCCAGTCGATCTCGGGTCTACCCGCGCGAATGTACAAAACCAGCAAAAACCTCGCCAAAAATCTTATAGAGGCCCGATGAGCCACGGAGGGATTTCCTCAACGTCGTATTGACAAACTTGAGATAGGGTGAGGGTAGACAGTCAAAGGTGTCCTTAATGAATCACACTTATCGCGGGCTTCTCACTGTAGACATGCCATCCAATGATTTGCATTGCCAGGAGGGTGCCTCTGTGGATCGGACGCAGTCGGTTGTGGGCCGGATTTCCGGTCTTTTGCGGAGCTAACGGTACGGCTATAAGGCTACGTGAGGCTGTCAAGACGCATAGGACCTGAGAGCCCAGGGGGTTCTTGAGACTATTATAGTCGAACCTAGTAATTACTCTGCAGACATTGATTCTCCAGAACGAAGCTTAGCCCTTAACGAGCACGGCACTCATCATGGGGGGTCTGCAAGTTTTCCGAATTTCTGGAGCCCGAGTGATATCATATAGTAGATCCAACCCGATCGTATATCAGTCACTCCGGGTACCCAAATTTGCGGCGCTCTCATCTTGTAGCTACAATTACGACGAGTTACCAAGACCTCCTATGACGCGGATCCGTTACCACTATGAGTAGGTGCATAAAGCCTGCCACACGGGACCCTCCAACTGGGACCTTATAGTTTACGCAATTGTCCCCCGTTGAGCCACTCCTTTTAACTCTGCTCAATGTATCGTCGTCCCGTTTGGGAGTGCGGGCATTTAAAATTAGAACCATGGGGCCACAATTCACCCTGCACTCATATGACGTGGCTGCGGTGTTTGCAGCTTTTAATCAATGCGTTATGAACATGAAGCGACCCAGGCGTTGTATCGATATGTCCGCTATTAACCACCAGGTGAGGAGGCAACACAACCTCTGATAACCCACCGCTACTGTGGGGCACGCGCGGGTGAAGGATCCCTTACATAGCCCGTTGTTTACAGTGTTGAATTTATAAGGTTACCACACGGAGAGCCTGCTACCGCATGCAGCTCTGTGGAGAGATATGCTCCTGCGCGATGTGAGGGCCTGCCATTCACAGTTATACGCAAGCAAATGAGGACTTGTAGGCGCCTTGTCTAGGAGAAGACGATTAGCGCGGAGTCTACCCAAGTGTAATTGGCGCTGCCTAGATCAACTCAATTAACCTGCGCAACTTGGTCTGACAACAGCTACTAACTTCCCGCCTAGTAGCTATGAACACCTATGCATCGTCCCCCGGTACAGACTGCAGGTCGTCACTCCCGGATTTCTAGGATAGCATGCTCGTTGTTCCAGTACCATGGCGCGATAGAAAGAGTTATCGGGGTCCCTCGGAGATGCCAGCCATTAAGGAAAGATGGGTATATTCCACTACCGGACAGATCTCAATTTCGCACCCTTCGGTTCACGTGTTGTTTCGGGACGAGCGTCGACGTATCGGGCGCACGCCTATGTAAACCGATGATCACGATGCCGAGAACGTATAACTTTCCATACGGACAGTGGCTGTTCCTCTCGTCAGATCCGCCATCAGATAAGTGGGTCGAGTTGCCATACCGCCTCTATCCCTATGTTCCGTGTCCGTGAGTGTTCTAACTAGGCGGGAAACAATACCAGACATCTTCTCAGTTACACGCTACATCTCTCGGGAGCATCTTATGAATATGAGGCGACTGGATGTCATTGGGGCTTGGTCGGGATCTTCGCTGCCAGGGTACATACCAATACCAAAAAGCAGGTTTTTTAATATGAAAAGGGGCAGTCAAATTAGAGATCACTACACATTGCATATATTGAGTCAAAGCATGTTTTCAGCTGTAGCGGACACACACTCAGATCTCTGTTCAACCGCCGGAGCCTATGCATTTCCGCCTACAGCCGTATAGCGGCCCAGTTGCTAGATTTAGGTTCGACAGGGTAAAAGTAAACGAGCACAGGGTGTGATGGTTTTTTTGGAGCGTGAGCAACTTAGCTTACCGCTGCCTAATCGAGAGAACTGGTTGGAATGTAGGTCCTGCCCGAAGCGATGAGTCCGGGGCTGACCACAAGCTCTCTTCCGGGAACTGGTTAAGAGAAGGTATATCTGCAAATTGCAAAAGCAGCGGGTCTTGAAGGACTTAGCTCGGCATTGTAGGAGTGGGGATATTATGCATGCCCACACACTCTCGTCTCCCACGGTTCAGCAGAAATAGTCAACTGGAATGAACTAACGCAGTCATCTACATTCGCACATGAAATGTCTGTACGCATGTTTCCAAGCCCGTATCAACAACCAGAGCTGCCGTTCTCAACGAATAAGACCAAAACAGAAGAAAAGTACCTGCCATCGCGCTGGCTTGTCACCAAGTCTATGTAATGTTACTAGGGCCTGCACTGCCAAATGGTACCACAATACACTGGTGAGGTGCGAATTGCTGGTAGACGACAAGTGTAATGACCGTGGAGCCTCTGGCTGTAGGTAGCATGGCCTCTCACCCGAGTGTGTCGAGGTCGATAGAATCCGTAAGCCTGCGGTCAACGCGCGAAGTTCAACCTCTTAAGTACTAGCTCCTCGAACGGCTTGTTTAGCAAGACATTACCCGGAACGGCACCGCTATACCTTAAGGTTCCCACTCCTTGAAACTGACTCCGCAAGGCACTCCCGAAGGGAACTACTATGCACTGACTCGTGCCAGAGTACAACTGACGATTGCTATAATGTAAGGGCATCGCATGGCGAGCAATAGGACTGTGGTTAGATTTCTGTATCCGTGGCGAAGCCGTAACCAGGTCCCCTCCGTTCCGGCCCCACCTATGCCTATTAGAAGTGGTATGTGATCAAAAAGAACTATGGGGGCAGTGCCCGCGTAGCATTGAGCAGCACTGCGTACTCACGCTACCCATTAGACCAGACAGAATCTGCGGGCCGCCAAAGG";
        String acid = "QCIVVPFGSA";

        DNA dna = new DNA(text);
        RNA rna = dna.transcribe();

        ArrayList<String> sub = rna.translate().findArea(acid);

        for (String s : sub) {
            Dump.println(RNA.toDNA(s));
        }

    }

}
