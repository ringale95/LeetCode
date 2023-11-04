public class StringlengthremoveChar {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "").replace("CD", "");
        }
        return s.length();
    }

    public static void main(String[] args) {
        StringlengthremoveChar solution = new StringlengthremoveChar();
        String str = "ABCDFDAVC";
        int num = solution.minLength(str);
        System.out.println(num);
    }
}
