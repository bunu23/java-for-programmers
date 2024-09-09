package controlflow;

public class Demo {
    public static void main(String[] args) {
        int i=1;
        while(true){
            if(i>5){
                break;
            }
            System.out.println(i);
            i++;
        }

    }
}
