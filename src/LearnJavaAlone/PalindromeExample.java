package LearnJavaAlone;

public class PalindromeExample {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454; // it is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10; // getting remiander
            sum=(sum*10)+r;
            n=n/10;
        }

        if (temp==sum){
            System.out.println("Palindrome Number");

        }else
            System.out.println("Not Palindrome Number");

    }
}
/*
Palindrome number is a number that is same after reserve fro example 545, 343, 121
also the same for string dad, mum, sos
 */