public class Demo {
    public static void main(String[] args) {

 short minShortValue=Short.MIN_VALUE;
 int minIntValue=Integer.MIN_VALUE;

byte minByteValue=Byte.MIN_VALUE,  maxByteValue=Byte.MAX_VALUE;

        System.out.println(minShortValue);
        System.out.println(minIntValue);
        System.out.println(minByteValue);
        System.out.println(maxByteValue);

        int total=(minIntValue/2);
        System.out.println(total);

        byte newValue= (byte) (minByteValue/2);
        System.out.println(newValue);

       short new2=(short)(maxByteValue+2);
        System.out.println(new2);

// Implicit casting converting from a smaller type to a larger type
        int intVal = 100;
        long longVal = intVal;
        float floatVal = longVal;
        double doubleVal = floatVal;

        // Explicit
        double doubleVal2 = 9.78;
        int intVal2 = (int) doubleVal2;

        float floatVal2 = 3.14F;
        short shortVal = (short) floatVal2; // float to short


        System.out.println("Widening Casting:");
        System.out.println("intVal: " + intVal);
        System.out.println("longVal (from intVal): " + longVal);
        System.out.println("floatVal (from longVal): " + floatVal);
        System.out.println("doubleVal (from floatVal): " + doubleVal);

        System.out.println("\nNarrowing Casting:");
        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("intVal2 (from doubleVal2): " + intVal2);
        System.out.println("floatVal2: " + floatVal2);
        System.out.println("shortVal (from floatVal2): " + shortVal);


    }

    }

