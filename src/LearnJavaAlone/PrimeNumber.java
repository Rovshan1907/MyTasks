package LearnJavaAlone;

public class PrimeNumber {
    public static void main(String[] args) {

        // Let's see the prime number program in java. In this java program, we will take anumber variable and check whether the number is prime or not.

        int i,m=0,flag=0;
        int n=3; // it is the number to be checked
        m=n/2;
        if (n==0||n==1){
            System.out.println(n+"is not prime number");

        }else {
            for (int j = 2; j <=m; j++) {
                if (n % j == 0) {
                    System.out.println(n + "is not prime number");
                    flag = 1;
                    break;
                }

            if (flag == 0) {
                System.out.println(n + "is prime number");
            } // end of else

                System.out.println(n);
        }

        }







    }
}
