public class Demo {
    public static void main(String[] args) {
        int age = 25;
        boolean hasTicket = true;
        boolean isMember = false;


        if ((age >= 18 && hasTicket) || isMember) {
            System.out.println("You are allowed entry.");
        } else {
            System.out.println("You are not allowed entry.");
        }
    }


}

