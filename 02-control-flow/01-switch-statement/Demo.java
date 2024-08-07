package controlflow;

public class Demo{

    public static void main(String[] args) {


        int value=3;
        switch (value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3, 4,5");
                System.out.println("was "+ value);
                break;

            default:
                System.out.println("Invalid was not 1 or 2");
        }


    }


}