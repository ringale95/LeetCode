public class FindANumber {
    private static boolean findNumberByFor(int target, int[] a){
        for(int i = 0; i < a.length; i++)
            if(a[i] == target)
                return true;
        return false;
    }

    private static boolean findNumberByBS(int target, int[] a){
        int lo = 0;
        int hi = a.length - 1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(a[mid] == target)
                return true;
            else if(a[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] a = new int[10000000]; // Increase the size of the array
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1; // Fill the array with consecutive numbers
        }

        int target = 10000000; // Set a target number that requires a full linear search

        long startTime = System.currentTimeMillis();
        // For
        System.out.println("Number Found? " + findNumberByFor(target, a));
        // BS
        //System.out.println("Number Found? " + findNumberByBS(target, a));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken for code execution: " + elapsedTime + " milliseconds");
    }
}
