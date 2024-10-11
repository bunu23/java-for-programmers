
public class LambdaThreadExample {
    public static void main(String[] args) {
        Thread thread=new Thread(
                ()->{
                    for(int i=0;i<=6;i++) {
                        System.out.println("hello from thread " + i);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }      );
                thread.start();

for(int i=1;i<=5;i++){
    System.out.println("Hello from main thread "+i);
    try{
        Thread.sleep(1000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
}

    }
}
