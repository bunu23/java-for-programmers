package controlflow;

public class Demo {
    public static void main(String[] args) {
        int i = 1;
        boolean isReady = false;
        do {
            if (i > 5) {
                break;
            }
            System.out.println(i);
            i++;
            isReady=(i>0);
        }
            while (isReady) ;
        }

    }


