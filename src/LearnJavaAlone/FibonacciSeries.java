package LearnJavaAlone;

public class FibonacciSeries {
    public static void main(String[] args) {

     // Let's see the fibonacci series program in java without using recursion.
        // We can see here one Example

        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1+""+n2); // print 0 and 1

        for(i=2;i<count;++i){ // loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2;
            System.out.print(""+n3);
            n1=n2;
            n2=n3;

        }







    }
}
