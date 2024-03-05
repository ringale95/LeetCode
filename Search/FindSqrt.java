public class FindSqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        long lo = 0; // Start from 0, not 2
        long hi = x;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;

            if (square == x)
                return (int) mid;
            else if (square < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return (int) hi; // Return the floor of the square root
    }

    public static void main(String args[]){
        int result = mySqrt(16);
        System.out.println(result);
    }
}

