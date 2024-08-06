public class DemoFour {

public static void main(String[] args){
DemoFour demoFour=new DemoFour();
  demoFour.display();

}
public void show(int a){
    System.out.println("Integer: "+a);
}
public void show(double a){
    System.out.println("Double: "+a);
}
public void show(String a){
    System.out.println("String: "+a);
}

public void display(){
    show(2);
    show(10.2);
    show("Hello");
}


}