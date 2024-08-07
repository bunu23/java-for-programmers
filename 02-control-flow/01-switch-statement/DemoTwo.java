package controlflow;

public class DemoTwo{

    public static void main(String[] args) {

//Enhanced Switch

        int value=3;
        switch (value) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was 3, 4,5");
                System.out.println("was " + value);
            }
            default -> System.out.println("Invalid was not 1 or 2");
        }




    }


}