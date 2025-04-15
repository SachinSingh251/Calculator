
import java.util.Scanner;

class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static double div(int a,int b){
        return a/b;
    }
    public static void main(String []args){
        //branching
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();
        sc.close();
        switch (operation) {
            case 1:
                System.out.println(add(a,b));
                break;
            case 2:
            System.out.println(sub(a, b));
                break;
            case 3:
            System.out.println(mul(a, b));
                break;
            case 4:
            System.out.println(div(a, b));
                break;
            default:
                throw new AssertionError();
        }
    }
}