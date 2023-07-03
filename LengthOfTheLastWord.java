public class LengthOfTheLastWord {
    public int lengthOfLastWord(String s) {
        String s1[] = s.split(" ");
        int i = s1.length;
        int l = s1[i-1].length();
        return l;
    }
}
