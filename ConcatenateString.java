public class ConcatenateString{

    public boolean resultConcat(String[] word1, String[] word2){
        String concatArr1 = "";
        String concatArr2 = "";

        for(String word : word1){
            concatArr1 += word;
        }

        for(String word : word2){
            concatArr2 += word;
        }

        if(concatArr1.equals(concatArr2))
            return true;
        
        return false;
    }

    public static void main (String args[]){
        ConcatenateString obj = new ConcatenateString();
        boolean value = obj.resultConcat(new String[]{"ab", "d"}, new String[]{"a","bc"});
        System.out.println(value);
    }
}