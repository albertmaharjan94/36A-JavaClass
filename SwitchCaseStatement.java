public class SwitchCaseStatement{
    public static void main(String[] args){
        int day = 5;
        switch (day){
            // day == 0
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        // nest swtich statement
        String beverage = "Coke";
        char gender = 'M';
        switch(beverage){
            case "Coke":
                switch(gender){
                    // Coke and M
                    case 'M':
                        System.out.println("Male");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;
                }
                System.out.println("Black");
                break;
            default:
                System.out.println("Unknown beverages");
                break;
        }

        // Switch case or
        int status = 404;
        switch(status){
            // status == 200 || status == 201 || status == 202
            case 200:
            case 201:
            case 202:
                System.out.println("Success");
                break;
            // status == 401 || status == 404
            case 401:
            case 404:
                System.out.println("Not found");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }

        // Task 1
        // make an int month and assign value
        // int month = 4;
        // using switch case check the month and print the following
        // 0 -> Jan
        // 1 -> Feb
        // 2 -> Mar
        // 3 -> Jun
        // .. continue each month till 11
        // 11 -> Dec
        // else -> Unknown month

        // Task 2
        // Make a variable String locale and assign "np"
        // String locale = "np"
        // using switch case check the and print the following
        // "en" or "en/us" or "en/uk" -> "Selected english"
        // "in" -> "Selected Indian"
        // "jp" -> "Selected Japanese"
        // "np" -> "Selected Nepali"
        // else -> "Unknown locale"
    }
}