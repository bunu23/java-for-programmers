package javafundamentals;

class Demo {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        int result = a + b;
        // int result=a/b;
        // int result=a%b;
        // int result=a-b;
        System.out.println(result);

        // boolean res = a < b;
        // boolean res=a<=b;
        // boolean res=a>=b;
        // boolean res=a!=b;
        boolean res = (a >= b && a > 0);
        System.out.println(res);

        if (a > b) {
            System.out.println("hey");
        } else if (a < b) {
            System.out.println("hello");
        } else {
            System.out.println("bye");
        }
    }
}