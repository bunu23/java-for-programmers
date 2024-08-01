public class Demo {
    public static void main(String[] args) {

 int age=30;
 String result=(age>18)?"you are an adult":"you are not";
        System.out.println(result);

boolean isSunny=true;
String res=isSunny?"Sunny day!":"It is not sunny!";
        System.out.println(res);

String car="Tesla";
boolean isTesla=car=="Tesla"?true:false;
        System.out.println(isTesla);

    String fruit="apple";
    boolean isApple=(fruit!="apple");
        System.out.println(isApple);


int hour=12;
String greeting=(hour<12)?"Morning":"Afternoon";
        System.out.println(greeting);

    int a=19;
    int b=22;
    int larger=(a>b)?a:b;
        System.out.println(larger);


        int score=64;
        String grade=(score>=89)?"A":(score>=55)?"B":(score >=33)?"C":"D";
        System.out.println(grade);


        int number=10;
        String re=(number%2==0)?"Even":"Odd";
        System.out.println(re);
    }
}
