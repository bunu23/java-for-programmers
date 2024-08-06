public class DemoTwo {

    public static void main(String[] args) {
        DemoTwo demo=new DemoTwo();
        System.out.println(demo.add(2,2));
        System.out.println(demo.add(3,3,3));
    }


    public int add(int a, int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;

    }
    public double add(double a, double b){
        return a+b;
    }
}