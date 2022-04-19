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

    }

}
