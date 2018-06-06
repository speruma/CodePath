public class LengthOfLastWord {
    public int lengthOfLastWord(final String A) {
        String[] strings = A.split(" ");
        if(strings.length > 0) {
            return strings[strings.length -1].length();
        }  else {
            return 0;
        }
    }
}
