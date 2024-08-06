public class DemoThree {

public static void main(String[] args){
DemoThree demoThree=new DemoThree();

    demoThree.show(5);
    demoThree.show(5.5);
    demoThree.show("Hello!");

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



}