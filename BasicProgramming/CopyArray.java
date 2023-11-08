public class CopyArray{

    public static int[] copy(int a[]){
        int n = a.length;
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String args[]){
        int a[] = {4,5,6,7};
        int b[] = copy(a);
        for(int i = 0;i<b.length;i++){
        System.out.print(b[i]+" ");
        }
    }
}