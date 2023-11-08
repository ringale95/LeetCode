public class MaxArray{

    public double calculateMax(double a[]){
        //create a variable to store the max
         double max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
            
        }
          return max;
    }

    public static void main (String args[]){
        MaxArray max = new MaxArray();
        double a[] = {12,15.9,21,20.5};
        double maximumNum = max.calculateMax(a);
        System.out.println(maximumNum);
    }
}