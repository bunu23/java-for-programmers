

interface A{
    default void methodA(){
        System.out.println("this is interface A");
    }
}


class B implements A{
    public void methodA(){
        System.out.println("this is class B");
    }
}
public class Main {
    public static void main(String[] args) {


    A a=new B();
    a.methodA();
}
}