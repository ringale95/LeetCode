public class Stringcountjewels{

    public static int countJewels(String jewels, String stones){
        int sum = 0;
        for(char stone : stones.toCharArray())
            if(jewels.contains(stone + ""))
                sum++;
        return sum;
    } 


    public static void main(String args[]){
        String jewels = "aA";
        String stones = "aAAbbb";
        int count = countJewels(jewels,stones);
        System.out.println(count);
    }
}