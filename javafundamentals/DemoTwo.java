package javafundamentals;

class DemoTwo {

    public static void main(String[] args) {

        int a = 9;
        int b = 3;
        int result = 0;

        // ternary operator
        // result=a>0?3:19;

        // if-else
        if (a > 0)
            result = 3;
        else
            result = 19;
        System.out.println(result);

        // switch statement
        // switch (a) {
        // case 1:
        // System.out.println("one");
        // break;
        // case 2:
        // System.out.println("two");
        // break;
        // default:
        // System.out.println("nothing");
        // }

    }

}