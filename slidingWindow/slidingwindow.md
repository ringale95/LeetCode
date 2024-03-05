# Sliding Window

- Reduce use of nested for loops and replace with single loop
- Reduce time complexity

## Where to use Sliding window?
- Array, String, Sub Array, Sub String, Largest Sum, Maximum Sum, Minimum Sum

## How to use sliding window?
Find the size of the window required
Compute the result for 1st window, i.e. from the start of the data structure
Then use a loop to slide the window by 1, and keep computing the result window by window.
Also add the current sum to window and subtract the previous sum from window to calcualte the current sum of window 

```agsl
     int window_sum = 0;
        int current_sum = 0;
        for( int i = 0; i < k ; i ++){
            current_sum = current_sum + arr[i];
            window_sum = current_sum;
        }

        for(int i = k; i < n; i++){
            window_sum = window_sum + arr[i] - arr[i - k]; //delete previous sum and add current array sum
            current_sum = Math.max(current_sum, window_sum);
        }
        return current_sum;
    }
```
