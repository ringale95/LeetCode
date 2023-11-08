public class ReverseArray{
    public void reverse(int a[]){
        
        int n=a.length;
    
        for(int i=0;i<n/2;i++){
            int temp = a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }


        for(int k = 0; k<n; k++){
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String args[]){
        ReverseArray obj = new ReverseArray();
        int a[] = {5,6,7,8};
        obj.reverse(a);
    }
    
}