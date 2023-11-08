public class AbsDouble{
    
    public static double abs(double x){
        if(x < 0.0)
            return -x;
        else
            return x;
    }

    public static void main(String args[]){
        double value = abs(-9.8);
        System.out.println(value);
    }
}