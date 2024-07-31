public class Demo {
    public static void main(String[] args) {

     String str1="Hello";
     String str2="World";
     String str3=new String("Strings in Java");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String concat=str1+" "+str2;
        System.out.println(concat);

        int len=str1.length();
        System.out.println(len);

        String subString=str3.substring(4,9);
        System.out.println(subString);

        String uppercase=str1.toUpperCase();
        String lowercase=str1.toLowerCase();
        System.out.println(uppercase + " "+lowercase);

        String withSpace="       Hello     !   ";
        String trimmed=withSpace.trim();
        System.out.println("trimmed "+ trimmed);

        String replace=str1.replace("Hello","world");
        System.out.println("Replaced: "+replace);

        String[] words=str3.split(" ");
        System.out.println("split words: "+words);
for(String word: words){
    System.out.println(word);
}
        boolean contains = str3.contains("Programming");
        System.out.println("Contains 'Programming': " + contains);

        boolean startsWith = str3.startsWith("Java");
        boolean endsWith = str3.endsWith("Programming");
        System.out.println("Starts with 'Java': " + startsWith);
        System.out.println("Ends with 'Programming': " + endsWith);

        String str4 = "Java Programming";
        boolean isEqual = str3.equals(str4);
        boolean isEqualIgnoreCase = str3.equalsIgnoreCase("java programming");
        System.out.println("Equals: " + isEqual);
        System.out.println("EqualsIgnoreCase: " + isEqualIgnoreCase);

        char charAtIndex = str3.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex);


        int indexOf = str3.indexOf("Programming");
        System.out.println("Index of 'Programming': " + indexOf);
    }


    }



