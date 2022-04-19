package LearnJavaAlone;

public class FactorialExample {
    public static void main(String[] args) {

        int i,fact=1;
        int number =5; // It is the number to calculate factorial
        for(i=1;i<number;i++){
            fact=fact*i; // here is factoriial
        }

        System.out.println("Factorial of"+number+"is:"+fact); //here will give us output factorial of 5 is 120



    }
}
