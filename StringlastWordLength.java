public class StringlastWordLength{

public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1; i>=0;i--){
            if(s.charAt(i)!=' '){
            count++;
        }else{
            break;
        }
    } return count;
    }

    public static void main(String args[]){
        StringlastWordLength solution = new StringlastWordLength();
        String str = "Hello World";
        int count = solution.lengthOfLastWord(str);
        System.out.println(count);
    }
}