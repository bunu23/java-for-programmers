package controlflow;

public class DemoThree {

    public static void main(String[] args) {
        int count=0;
        for(int i=10;i<=1000;i++){
            if(isPrime(i)){
                System.out.println("number "+i+" is a prime number");
                count++;
                if(count==3)
                    break;
            }
        }
}


    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }


        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    }

