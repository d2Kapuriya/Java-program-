//package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter first num:");
       int a=sc.nextInt();
       System.out.println("Enter second num:");
       int b=sc.nextInt();
       
       if(a>0 && b>0){
	System.out.println("Enter sign(+,-,*,/) :");
       String c=sc.next();
       char d=c.charAt(0);
        System.out.println("d="+d);
        int ans=0;
        
      switch(d){
          case '+':
              ans=add(a,b);
              System.out.println("Answer is "+ans);
              break;
          case '-':
              ans=sub(a,b);
              System.out.println("Answer is "+ans);
              break;
          case '*':
              ans=mul(a,b);
              System.out.println("Answer is "+ans);
              break;
          case '/':
              ans=div(a,b);
              System.out.println("Answer is "+ans);
              break;
          default :
              System.out.println("invalid choice.");
      }
    }
       else
            System.out.println("Negative value is not allow.");
    
}
	public static int add(int a,int b){
	  return (a+b);
	}
	public static int sub(int a,int b){
	  return (a-b);
	}
	public static int mul(int a,int b){
	  return (a*b);
	}
	public static int div(int a,int b){
	  return (a/b);
	}
}