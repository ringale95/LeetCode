public class PrimeNum{

    public static boolean prime(int n){
        for(int i=2; i*i <= n; i++) //to reduce number of iterations of for loop we used i*i
            if(n%i == 0)
            return false;
        return true;
    }

    public static void main(String args[]){
        int num = 80;
        boolean result = prime(num);
        System.out.println(result);
    }   
}