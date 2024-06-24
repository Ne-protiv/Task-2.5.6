import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private byte[] asciiArray;

    public AsciiCharSequence(byte[] array) {
        this.asciiArray = array;
    }

    @Override
    public int length() {
        return asciiArray.length;
    }

    @Override
    public char charAt(int number) {
        return (char) (asciiArray[number]);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(asciiArray.length);
        for(int i = 0; i < asciiArray.length; i++ ){
            result.append((char)asciiArray[i]);
        }
        return result.toString();
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subArray = Arrays.copyOfRange(asciiArray,start,end);
        return new AsciiCharSequence(subArray);
    }
}