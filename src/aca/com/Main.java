package aca.com;
import static java.lang.StrictMath.pow;
import java.util.Scanner;

class  ReverseString {
    public static void reverseString(String string) {
        if ((string == null) || (string.length() <= 1)) {
            System.out.println(string);
        }
        else {
            System.out.print(string.charAt(string.length() - 1));
            reverseString(string.substring(0, string.length() - 1));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        //String string ="S P I T A K    A R C H ";
        System.out.println("The given string is:\n " + string);
        System.out.println("The string in reverse is ");
        reverseString(string);
        System.exit(0);
    }
}

class CountDown{
    public static void printReverseOrder(int n) {
        if (n<0){
            System.out.println("Error");
            System.exit(0);
        }
        else if (n == 0) {
            System.out.println("0");
        }
        else {
            System.out.print(n + "  ");
            printReverseOrder(n -1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printReverseOrder(n);
        System.exit(0);
    }

}

class ReversFactorial {
    static long fact(long a) {
        if (a < 0) {
            System.out.println("Error");
            System.exit(0);
        } else if (a == 0) {
            return 1;
        } else {
            return (a * fact(a - 1));
        }
        return a;
    }
    public static void main(String[] args) {
        long b;
        Scanner  a = new Scanner(System.in);
        System.out.println("Input number ");
        b =a.nextInt();
        System.out.println("Factorial = "+fact(b));
        System.exit(0);
    }
}

class PrintFibonacci{
    public static long fib(int num){
        if(num==0)return 0;
        if(num==1)return 1;
        return fib(num-1)+fib(num-2);
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int a = in.nextInt();
        System.out.println("Print Fibonacci Series in Java");
        for(int num=0;num<=a;num++)
            System.out.println(num+" "+fib(num));
        System.exit(0);
    }

}

class ReverseNumbeRecursion {
    static int reverse(int a, int length) {
        if(length == 1) {
            return a;
        }
        else {
            int b = a % 10;
            a = a / 10;
            return (int) ((b * pow(10, length - 1)) + reverse(a, --length));
        }
    }
    public static void main(String[] args) {
        int a;
        int count = 0;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:\n");
        a = s.nextInt();
        b = a;
        while(b > 0) {
            count++;
            b = b / 10;
        }
        int x = reverse(a, count);
        System.out.println("Reverse:\n"+x);
    }
}

class CalculateThePower  {
    static int power(int a, int b) {
        if (b == 0){
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Input number");
        int power = in.nextInt();
        System.out.println("Input power");
        System.out.println(power(number, power));
        System.exit(0);
    }
}

class DecimalToBinary {
    public static String binary(int b) {
        int a;
        if(b > 0) {
            a = b % 2;
            return (binary(b / 2) + " " +a);
        }
        return "";
    }
    public static void main(String[] args) {
        int a;
        String x;
        Scanner in = new Scanner(System.in);
        System.out.print("Input decimal number:\n");
        a = in.nextInt();
        x = binary(a);
        System.out.print("Binary number:\n"+x);
        System.exit(0);
    }
}
