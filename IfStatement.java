public class IfStatement{
    public static void main(String[] args){
        // If statement, decision making
        int num1 = 10;
        if(num1 > 9){
            System.out.println("Greater than 10");
            // more statement
        }

        // If - else statement
        if(num1 > 20){
            System.out.println("Greater than 20");
        }else{
            System.out.println("Lesser than 20");
        }

        // if - else - if
        if(num1 == 10){
            System.out.println("Num is 10");
        }else if(num1 == 9){
            System.out.println("Num is 9");
        }else{
            System.out.println("Num is unknown");
        }

        // if - else - if ladder // multiple else if
        String bevarage = "Coke";
        if(bevarage == "Fanta"){
            System.out.println("Orage drink");
        }else if(bevarage == "Coke"){
            System.out.println("Black drink");
        }else if(bevarage == "Sprite"){
            System.out.println("Clear drink");
        }else{
            System.out.println("Unknown drink");
        }

        // Nested if 
        if(bevarage == "Coke"){
            if(num1 == 10){
                System.out.println("Coke and 10");
            }else{
                System.out.println("Only Coke");
            }
        }else{
            if(num1 == 10){
                System.out.println("Only 10");
            }else{
                System.out.println("No coke and 10");
            }
        }
        // Task 1
        // make a varialbe int day and assign value 
        // if day is 1 -> print Sunday
        // if day is 2 -> print Monday
        // if day is 3 -> print Tuesday
        // if day is 4 -> print Wednesday
        // if day is 5 -> print Thursday
        // if day is 6 -> print Friday
        // if day is 7 -> print Saturday
        // if day is not in number -> print Unknown Day

        // Task 2 -> Use nested if
        // Make a variable avgMark and a char variable gender
        // if avgMark is greater than 80 and gender is 'M' print "Good boy"
        // if avgMark is greater than 80 and gender is 'F' print "Good girl"
        // if avgMark is notgreater than 80 and gender is 'M' print "Bad boy"
        // if avgMark is notgreater than 80 and gender is 'F' print "Bad girl"
        double avgMark = 89.22;
        char gender = 'M';
        if(avgMark > 80){
            if(gender == 'M'){
                System.out.println("Good boy");
            }
            else if(gender == 'F'){
                System.out.println("Good girl")
            }else{
                System.out.println("Good unknown");
            }
        }else{
            if(gender == 'M'){
                System.out.println("Bad boy");
            }
            else if(gender == 'F'){
                System.out.println("Bad girl")
            }else{
                System.out.println("Bad unknown");
            }
        }
    }
}