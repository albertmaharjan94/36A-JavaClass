public class VariableIntroduction{
    public static void main(String[] args){
        // shortcut psvm
        // Primitive datatype
        // Declaration
        boolean boolVariable;
        // Initialization
        boolVariable = false;
        // Declaration and Initialization
        int intVariable = 10;
        // Multi Declaration
        float floatVariable1, floatVariable2;
        // Initialization
        floatVariable1 = 10.33f;
        // Multi Declaration and Initialization
        char charVariable1 = 'c', charVariable2 = 'a', charVariable3 = 't';
        // Limitations
        // byte byteVarialbe = 10000000000; cannot excced the capacity
        // short shortVariable = false; cannot mismatch type of value

        // Non Primitive Datatype
        String stringVariable = "Hello world";
        // String value is enclosed in double quotes ""
        // Can make string using constructor
        String stringVariable2 = new String("Object of string");

        /* Task
         * Declare the following variable
         * firstName String
         * lastName String
         * age int
         * over18 boolean
         * Intialize each variable with your own detail
         * Declare multiple variable
         * mathMarking, englishMarking, scienceMarking -> float
         * Initialize each variable with decimal number
         * Declare and initialize multiple variable
         * averageMarking, gpa -> double
         */
        String firstName;
        String lastName;
        int age;
        boolean over18;
        firstName = "First Name";
        lastName = "Last name";
        age = 100;
        over18 = true;

        float mathMarking, englishMarking, scienceMarking;
        mathMarking = 60.3f;
        englishMarking = 77.1f;
        scienceMarking = 90.12f;

        double averageMarking = 60.99d, gpa = 3.4;
        // 'd' is optional in double
    }
}