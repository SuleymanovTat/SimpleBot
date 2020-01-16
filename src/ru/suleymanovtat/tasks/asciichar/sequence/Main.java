package ru.suleymanovtat.tasks.asciichar.sequence;

public class Main {

    public static void main(String[] args) {
        byte[] sample = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        AsciiCharSequence charSeq = new AsciiCharSequence(sample);
        System.out.println("Char  sequence  toString(): " + charSeq.toString());//Hello world!
        System.out.println("Char  sequence length(): " + charSeq.length());//12
        System.out.println("Char at 0 position: " + charSeq.charAt(0));//H
        System.out.println("Char at 11 position: " + charSeq.charAt(11));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 1));//H
        System.out.println("Char subSequence: " + charSeq.subSequence(11, 12));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 4));//Hell
    }
}
