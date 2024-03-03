public class CountWordInSequence{

    public int countWord(String sequence, String word){
    int count = 0;
    while(sequence.contains(word)){
        count++;
        sequence = sequence.replaceFirst(word,"");
    }
    return count;
    }

    public static void main(String args[]){
        CountWordInSequence obj = new CountWordInSequence();
        int value = obj.countWord("ababc","ab");
        System.out.println(value);
    }
}
