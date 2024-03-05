public class StringComparison {

    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Comparison 1 : " + (str1 == str2));
        System.out.println("Comparison 2 : " + (str1.equals(str2)));
        System.out.println("Printing hascode1 : " + str1.hashCode());
        System.out.println("Printing hascode2 : " + str2.hashCode());

    }
}
