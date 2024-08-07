package controlflow;

public class DemoFour {

    public static void main(String[] args) {

        String month = "Apr";
        System.out.println(month + "is in " + getQuarter(month) + " quarter");


    }

    public static String getQuarter(String month) {
           //Enhanced Switch
        return switch (month) {
            case "Jan", "Feb", "March" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "July", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + "is invalid";
                yield badResponse;

            }
        };


    }

    //Traditional Switch
//        switch (month){
//        case "Jan":
//        case "Feb":
//        case "March":
//            return "1st";
//        case "Apr":
//        case"May":
//        case "Jun":
//            return "2nd";
//    }
//        return "Invalid";
//
//
//}

}