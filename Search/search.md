# Binary Search

- Operates on contiguous sequence
- Area between left and right index in BS is search space
- Always sort to apply BS
- Apply BS if we want to find an element or index in collection

# How to identify Binary Search problems & reasons why we use Binary Search, and the 3 different Binary Search templates

## Template 1:
- Basic BS algorithm:

```agsl
   public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        while(left <= right ){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target )
                left = mid +1;
            else
                right = mid -1;              
        }
        return -1; 
```
If BS is rotated across a pivot point then sorted elements on left comes to right and vice versa

## Template 2
Key attributes:
- Use the element's right neighbor to determine if the condition is met and decide whether to go left or right
- Guarantees Search Space is at least 2 in size at each step
- Post-processing required. Loop/Recursion ends when you have 1 element left. Need to assess if the remaining element meets the condition.

```
Initial Condition: left = 0, right = length - 1
Termination: left == right
Searching Left: right = mid
Searching Right: left = mid+1
```

### Template 3
- Guarantees Search Space is at least 3 in size at each step
- Post-processing required. Loop/Recursion ends when you have 2 elements left. Need to assess if the remaining elements meet the condition.

```
Initial Condition: left = 0, right = length-1
Termination: left + 1 == right
Searching Left: right = mid
Searching Right: left = mid
```