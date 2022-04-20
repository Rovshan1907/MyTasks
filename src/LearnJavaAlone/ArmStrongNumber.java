package LearnJavaAlone;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int c=0,a,temp;
        int n =153;
      //  it is the number to check armstrong
      temp=n;
      while(n>0){
          a=n%10;
          n=n/10;
          c=c+(a*a*a);
      }
      if (temp==c)
          System.out.println("An Armstrong Number");
      else
          System.out.println("Not An Armstrong Number");
    }

}
/*
Armstrong Number is a positive number if it is equal to the
 sum of cubes of its digits for example 0,1,153,370,371,407 and more....
 Let's try to underrtsnad why 153 is an Amrstrong number
152 = (1*1*1)+(5*5*5)+(3*3*3)
where:
1
125
27
and 1+125+27=153
 */