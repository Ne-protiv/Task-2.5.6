public class Task {
    public static void main(String[] args) {
        byte[] testArray =new byte[] {100, 77, 33, 125};
        AsciiCharSequence test = new AsciiCharSequence(testArray);
        char testChar = test.charAt(3);
        String testString = test.toString();
        AsciiCharSequence subArray = test.subSequence(2,3);
        System.out.println(test);
        System.out.println(testChar);
        System.out.println(testString);
        System.out.println(subArray);
    }
}

