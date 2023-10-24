public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

public static int substractMethod (int num1, int num2){
        return num1 - num2;
}



    public static int add(int n1, int n2){
        return n1 + n2;

    }

    public static int tripleAdd(int num1, int num2, int num3){
        return add(add(num1, num2),num3);
    }


}