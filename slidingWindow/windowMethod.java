public class windowMethod {

    public static int calculateWindow(int arr[], int n, int k){

        if(k > n){
            return -1;
        }

        int window_sum = 0;
        int current_sum = 0;
        for( int i = 0; i < k ; i ++){
            current_sum = current_sum + arr[i];
            window_sum = current_sum;
        }

        for(int i = k; i < n; i++){
            window_sum = window_sum + arr[i] - arr[i - k];
            current_sum = Math.max(current_sum, window_sum);
        }
        return current_sum;
    }

    public static void main(String[] args){

        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int n = arr.length;
        int k = 4;

        System.out.println(calculateWindow(arr, n, k));

    }
}
