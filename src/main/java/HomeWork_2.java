public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(checkTwoNumbers(2,8));
        checkNegative(-3);
        System.out.println(checkNegativeAgain(-55));
        printTwice("Hello", 5);
        System.out.println(whichYear(1961));
    }

    public static boolean checkTwoNumbers(int a, int b ) {
        return (a+b>=10 && a+b<=20);
    }
    public static void checkNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительно");
        } else {
            System.out.println("Отрицательно");
        }
    }
    public static boolean checkNegativeAgain(int a) {
        return !(a >= 0);
    }
    public static void printTwice(String s,int a) {
        for (int i =0; i < a; i++ ){
            System.out.println(s);
        }
    }
    public static boolean whichYear(int year) {
        return (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0);
    }
}
