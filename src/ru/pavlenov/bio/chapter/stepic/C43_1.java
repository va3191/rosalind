package ru.pavlenov.bio.chapter.stepic;

import ru.pavlenov.bio.genome.DNAArray;
import ru.pavlenov.bio.genome.Motif;
import ru.pavlenov.bio.utils.Dump;

/**
 * Какой сам ☭
 * User: Павленов Семён
 * Date: 28.11.13 20:25
 */
public class C43_1 {

    public static void start() {

        String tmp = "GAGACCATTAAGGACGATATCACAAAGTACATTTTCCATACTATATGTTAAATCTCGTCACCTGGCGTCATTTGGCCTGCACAGAGGTAATGGATGTGTGCTGCAATGGTGCACCGAGACTAGGGGTGTGTCGCCAGCGCCTAGTCGCTCTCCCCCTGAACGAGCCAGACTACAAACTTGAAGGCTGACAATAAAGTCTCAACCTGAGTTGGTATCTCTCGCGCGGGCTGCATGTTCGGAGCCCGCGTAATGACCGAGTATTGGCGTGTGTTTGCGATGACCGGTTAACCCCGGGCATCTGTATCATTGAGACCATTAAGGAC\n" +
                "GATATCACAAAGTACATTTTCCATACTATATGTTAAATCTCGTCACCTGGCGTCATTTGGCCTGCACAGAGGTAATGGATGTGTGCTGCAATGGTGCACCGAGACTAGGGGTGTGTCGCCAGCGCCTAGTCGCTCTCCCCCTGAACGAGCCAGACTACAAACTTGAAGGCTGACAATAAAGTCTCAACCTGAGTTGGTATCTCTCGCGCGGGCTGCATGTTCGGAGCCCGCGTAATGACCGAGTATTGGCGTGTGTTTGCGATGACCGGTTAACCCCGGGCATCTGTATCATTGCTCAAACATAATATAAGACCATTAAGGAC\n" +
                "TTCAGCGAAACTACGTAAGCTGAGCATGTACTCTTTGCTAATATAGCCTTCCACGTACTGAATCAGCTTTTGTCTTATACTGGTTCACGTGGTGTTCTTACCGGTTATGGAACCTTTGGTTCAGATGGGTATCACTGGATCGATCGAAACGTACAGACTCCCCTGCATACATCCGAGGGACGCAAATCTTCACCACGCTTTACCACCAGGGGACGGCTCTAGAAGCTTAGTCTACCTCGCCAGACACTCTTAGGTGCCTACAGAGTTGCCAAGGTATTATCAGCACCATAGGCTGTAATTACAATATTGGGCCCCGCGCCCCC\n" +
                "GCGATTCGTCGCGCTATGGCTGTCGACATGTCTATTTGTCGAATCCGGGTCCAGGTATTGCATGCCCGATGTCAATCAATAGGTTGAAGCAAAAACGGGAGACTGGTCATCCGGCGTCAGAAACGCAAAGGGCATTTATCTGTCGACGCCCTGGGGAGCGGGCAGGCGGTGAAACACCCCAGGGTTCGGCTGCCTCTTATATTAGCGGATGTGACGAGTCATCAAGTAACAATAATTCAGCGCCGTGAGACGGACGAGTCTCGCAGATCTGGGTTATTCCTCTTGCGATATATATAATGACTCTTCAAGAAGATCAAGTTGTG\n" +
                "GTTCGCTGTTCCCAGGGCCAGCTTTCGCGAGGCTGCCTCCGCAAGCGCCCATGGAAGTTGTCATCAAACAAAGGTTCGCACTGCCTAGCGTTTGCCTCTTGTTCAATATACAAGAGAAGATGGCGAGGACCTCGCATCATCTCTCTTGTCTAAGATATTATATTACGTTTCTTTTTCAGAAGGGAGTCGCTCAGGCTCCCACTTCCTTGTAAAATGAGAAGCCAACTCGAAACTTAAATATAAGAGCTGCACTTCACTAGGACCCTTTCTAAGCGAATGAATTGTTGCCTAAAACTACTCTGCGGCATTAGCGCGCCATCGCT\n" +
                "ATCTGGCTGGTTTGGCACTTGCCTATCACAGCCTGGAGACAGGTGTATCTACATATTCCGCACCGCGATGCAACCGGCATCGTGGTCGCATGGACCAAAAATTACGGGTGTCGGTACCAATTCGGCAACCCTAGGTGCTGCAGTAACGGAGAAGAAGGAGGCCAACTCGTGAAAGTGGTGAATCCCGACGGCCGAGATATGACTCGCTTGAAAGGGGCATTCCTCGGTGCTTATGTGTTCTCTTGAGCAATATAACAGTAATTAACCATTCTCGCACTTGCCAAATTCATCCTTTAGAATATCACTTAGCCTTATTATGCGCA\n" +
                "GTATGGTGAGGTTACGTGGCTCCGCACGTGTAATAAGACTGAGTATGGTCTAATAAGAGAAGACGAATTTTGAACTCTTGCATAAGCAACGCGGTTAGCCAAAAGACGCTTTTGAGATAATCATGACATCAAGATAGCCACCCATTGAGTTCAGAATTATGCTGATGATGTAAACCATGCTCGAGTATATCACCATACACTGAATGGCAAATAAGAACGTCACTCAACTACCCCTAATTTCCTCATGTGCATTATCTATCGGGATTGATACTCTATCTGAGAAACCAGGGTAAAGATCACCAAGCGATGGACCCGTCCACGAA\n" +
                "TATTAATTACATCCATGAGCCCGAACTTTGGCTATGTCGAAGTCTTATACTTCTTGCGACGTTGCTTATCCCGACTCTCTAGAGACTTGGTGGTATGTACTGGCCGATAACAAAAATAAAACCAACGCGGAGATAGCCCTAAAGCTCTCCTTTTACGACCGCCATGCTGCATAATGCGATGCGATCTGCTCCTGAAGGGTTACATGGCCAGATATACTTTAACTTCCGCATAATATATTGGTTGACCTTGCGGTAGTTCTCTAATGAATCATTCTGCAGTAATGCACATCCAAGTCCTTGAACCGCTCCATCTGTGTGATTGT\n" +
                "GTGTAGATCCGGTGCAGGCTGACAAAGCGTAGGACCTCCTACTTATACGTCACCCTCGAGCACACTTCAAATGGACGAAAGCAGTGTGGGAATAGTTACACTATACGGATGGTATGGTTAACCCGATCTCTTGCAGCTTATAAATAGAGACGTCGGTACCAAGGAGGGCGGTCAGGATTTCATAAGTGTTAACTCGGACCTTGGACTCCACGAAAGTCTGAAGAATTGAGAGCTCACGGATATAACACAAGTCTTAGGTTTAGTCCCAGGTGAACACACTGACGCGCCTGTCGGGGGAGCCTGAGATCTTTAAAAATGCCCAG\n" +
                "GGGACCAGGGATGACCCACGTGTCCAGTCCTCTATTTTCGAGTGTGCTTTCGATAACTGCCCCGGTTCTGAATTGAGTGGCTATAACAACCCAGACCTTTGATGATACAGTGAGGATTCCCCTGACATGAAAGTTTGAATTGTGCTCTAGTTAGACCGCGGGAGCCGGTAGCCGTGCGAAACACCCATGGTAACCCAACGAGGATTGGTACGGGGACTCTTGCATGGAATATCCGTGGCAAGAGCACTTGTGACTTCACATGGAAGAGTTAACCTACCAAGAATTCCCCAGGTTGAATGACGTATATGGGAATTCCGACTCCC\n" +
                "CAGTAAAGGCATGGTGGATTTGCAACTTCCAAGACTGGTGAATGATTGTACACTAAAATGGTCTAGTGTGTAAGAGCTTAAACCCGTGCGATGGACCAATATAATCTCATGAGTGCCATACAAAACAAAAAAGACCGCGTCCATAAAATGCACCCCCGCAGAGAAGGTCACGAGCGCACACATAGGGCAAAGGACCGAAGCCCAATGGCGGCCTAAAACCTAATAGTCTCCTTCGCTCGGATCTCTGTTATAATATAGTTTGCATTCCTATGACAACCTGACATTACTGCCTTACTGTTGTGTGATGGCTATACATTAACGGG\n" +
                "TAATCTTGTGGGCCGGGGGAGGCCAGGTGTTTCCAGTTCACCGCGTTATTGCCGACCTTCGTCCCCCGTTATCTAATGTGTAAGTAACGGATCTCATAATACTTAGGGAAAGGGATGCAAGTGGATTGGGATACGGGCGGCATTGCGTTGGTCCGGCAGTAGAATAGCATCGTGTCTTCCCATTCTCTTGCATAATGCGACAAGGGTTGGGAGTGCAGCTCTGTGCCCGACATAATGTCGCGCGCGGTCTTAATCCCATTCGTGCGTCCCGCGACCGCATAAAGCAAGAGCAGAATGTAATTTCTAGGTTGCCGCGTTAACGT\n" +
                "CAGGCCCGAAGCTTCAGGAGACGGCTATGTAATGTGGTACTTTTGGACCAGTGCTCGCAAAACATATTCAGATGCGGTGCCCCCTAGCTGAGGACTCAACGGCTTGAGGAAGCGCGAAAGGAAAATGGTGACAGGAGGACTTCCGCGGGTCTGTAAATCTTATATTGTCTCAGGTTTGCATAATATAATTCTTCAGTTAGGTGAAGAAATCCGCCCGGTACTGTATAAGAGCTCAACATCTACAGCCTGCGGGGGTTTTATGAGACATGCAACTCAGTTCTTTGTTCCGAGGAACGTCAAATGTTAGGAGGCCACAACAATGC\n" +
                "TCGAGGGGCGAGCGATTGGGAAGGGCACGACCACCGTAAGGTTCGCATCAACAAAGATTGACCGGAGTCGGGTGACTAGTCACACTCTTGTACCTCTTTCCCGCTTACCAGACCTTTTTGGCATCAAGGACCACGTCGTCCTCTTGCATACACTAAAAGGGCGATCAGCGAACGCTAACGTCGAGAACTAGCGACAGACTACTCGACGGTCTCTGCAAACTCTTTCTAGTCTCCTGGTCCGCGAAGTGTACACCCGACTGGGCCCAGAATTACCAACCTAGATCTGCATTGAACACTCTGTGCTTGGTGACGTCGATTCTCAT\n" +
                "GCAACGCGGGAATCCTTGTATAGGCACCTGACTGAAAACTACTCACGCTGAATAGCGCGCAACATAAAAACCGAGCACGTTGATGCCATGCATACGGTGCTTGTTATGGAAGAAAACTATCTAATCGTGTTCTCTCGGGAATTGATGCCTCGCCGGGAGTTCAATTTATTGCCCCGAACTCCTTCTTACTATTTTACGGCACCACACCACACCCGTATCACTGCGCATTTGATAGTTGTACATCCGGTCTTACTTTGCCTCGCTCCCGGTACATACGACCCAACGCTCAAACATAATATAAGTATGGCAAGCCGCTTTTAGGC\n" +
                "TTAGCAATCGTGCGGTTTTGCGCACCGGGTGTATCGGTGGTCCCTCTAGGGTATACGGGCCTACTCTGGGCTGAGCGGGGGCTTGGCAGTGGGGGTCCGTACAAACTTCAATCCGGGACAAAACAGGCATAGAAAATAAAGGTGTCTGTCCTGGCATGTCTTAACGCGCCAACACATGACAGTGGTCGACGACTACTATAATTAAAATATCGATGTTCGGCCACCTAAAAAAGACCTGACAGTTGAAAAACTATGCCAAAGTCTTGCAGGATCAGGAGTTCTTCACTTGGCTTGCATAATATCCAGTATGTGGCGAGCTGCCA\n" +
                "CGAGCCAAATTCTGTCTCGCTCTATGATAATATAAGTGTCACTACCGACCCGGCTGTCCACTTCGAGGGGTTTGTGGAGCAGGATTTCGAGCAATTATACTAAATGATAGTTGTATAAGGAACGCCTCCGTTATATGTGAGTGTACGCCCATAGTAATTGGCCGCGGGGGAATGCTTAGAGGAATAGTATGAGTTTTACTATGTAATCGTAACACGGCGATGATGATTACGCTCAAAAAAGGCAGGAAGGAAATCTACACCTAATAAAATTGTTCGGCAATAACTGTATTGGCTGTGTTGTAAACCCGGTTGCCACGCTGCGT\n" +
                "GATGGCAGCGGCTCTTTGCTAATATATTACGCCTTATAACAATGAGACGAACGACCGGGGGCTTTTCGGCCACCCAAATCTCACCCGGACCGCGGACACTGTGCCGTAGAACCTTATGCCACCCTCAAGACACAAGATCAGAGGCAGCTTGGCCATCATTGAAATATTCAGGATGAACTCTCCTTACCCGCAAATTGTAAATTTCAGTTTGGGGACGGCAAGAGCTTAGTCCATGGGCTCAGGGCCGCGGGTCCGGACTGCATGTGGTTGGTATGTCACCTTAGGCCCTTTAACTTATAACGATGTCACGCGAGCATTGGGTA\n" +
                "CTAAATCGGCCCTCTGGTCTCGAGCGAGTTCGGAATATTCCAACGTCTTGCAGGCCCGGGTGCATAATATAGATGTGGGTTACAGCACACAGGTTCATCAACAAGTGTGATGTCGGCACGAGACAGTTTAGTAATGATCGATCAACACATGACACCACGGAAGCCTACGTCGTTGGGGTTCCACGTCCTTTTCGCCTTTCGAGAGGCCGTTCACTGCCATCCAATTCCGCTCCAGTTGGAGTGCGAGGTCCGGCCTGGGACCTATTGCCGCTTTTGATCGTAGATAGCAGCGGTGCTACGCTGTACTCCCTTAGTCGGCGGGG\n" +
                "TGTGGTCTCGCAAGCACTTTTAACTTACTACTCTGTCGCATGGTTTGAGAGGGACATAAGACAAGGTCGTTCCCGATGTAGGTAAGTGAACTCTCTTGATCTCTGGGTAGCCCTACACAACCGCGTAGCCCAGTTCGCAACTTATTGCCATTTAATACGGCTCCGAGGTAAGCAGGCGTCCCTCAAGTTCTGAAGGACTGCGAAGTGATACCTATCCCGTAATCTTGCATAATAAGTGGTTAACTTTTTGGTAAACGCGCTGGTGCAAGTCTCACACGTCCGTATACTAATAATCCTGCCCTGAAGTCCGCGATAGCCGGCCA";

        String[] dnaList = tmp.split("\n");
        DNAArray dnaArray = new DNAArray(dnaList);

        Motif bestMotif = dnaArray.gibbsSampler(15, 20, 2000);

        Dump.println("");
        for (String kmer : bestMotif.getKmerList()) {

            Dump.print(kmer); Dump.println("");

        }
        Dump.println("");

        Dump.println(bestMotif.getScore());

    }

}