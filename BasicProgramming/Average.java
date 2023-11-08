public class Average{

    public double avg(double a[]){
        int n = a.length;
        double sum = 0.0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        return sum/n;
    }

    public static void main(String args[]){
        Average obj =  new Average();
        double a[] = {1,2,3,4,5};
        double value = obj.avg(a);
        System.out.println(value);
    }
}