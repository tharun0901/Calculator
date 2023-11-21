import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
    int n1,n2,opr;
    System.out.println("enter 1 for +,enter 2 for -,enter 3 for *,enter 4 for /,enter 5 for % ,enter 6 for power ^");
   System.out.println("Enter the first number:");
    Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    System.out.println("Enter the second number:");
    n2=sc.nextInt();
   System.out.println("Enter the operator:");
    opr=sc.nextInt();
    switch(opr){
        case 1:
        int add=n1+n2;
        System.out.println("sum is :"+ add);
        break;
        case 2:
        int sub=n1-n2;
        System.out.println("Subtraction is :"+ sub);
        break;
        case 3:
        int mul=n1*n2;
        System.out.println("Multiplication is :"+ mul);
        break;
        case 4:
                if (n2 != 0) {
                    double div= n1 / n2;
                    System.out.println("Division is :"+div);
                } 
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
        case 5:
        float mod=n1%n2;
        System.out.println("modular division is :"+ mod);
        break;
        case 6:
        double power = Math.pow(n1, n2);
        System.out.println("power of a number is :"+ power);
                break;
    }
}
}
