package ru.suleymanovtat.tasks.asciichar.sequence;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    byte[] byteSequence;

    public AsciiCharSequence(byte[] byteSequence) {
        this.byteSequence = byteSequence;
    }

    @Override
    public int length() {
        return byteSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (byteSequence.length < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > byteSequence.length) {
            throw new StringIndexOutOfBoundsException(end);
        }
        int subLen = end - start;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return new AsciiCharSequence(Arrays.copyOfRange(byteSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(byteSequence);
    }
}
