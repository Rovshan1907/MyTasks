package LearnJavaAlone;

public class FactorialExample2 {
    // Factorial Program using recursion
    static int factorial(int n){
        if (n ==0)
            return 1;
     else
         return(n*factorial(n-1));
    }
/// till here static method we wrote let's the find number to calculate
    public static void main(String[] args) {
        int i,fact=1;
        int number = 4;
        // it is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of"+number+"is:"+fact);

    }

}
