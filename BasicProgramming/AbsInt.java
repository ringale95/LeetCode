public class AbsInt{

    public static int abs(int x){
        if (x<0)
            return -x;
        else
            return x;
    }

    public static void main (String args[]){
        int value = abs(-5);
        System.out.println(value);
    }
}