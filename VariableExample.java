public class VariableExample{
    // Instance Variable
    int instanceVariable = 100;
    // instanceVariable can only be accessed with the object
    // Static Variable
    static boolean staticVariable = false;
    // staticVariable can be accessed with Class directly
    void firstFunction(){
        int localVariable = 300;
        // Local variable are made inside a function/constructer scope/block
        System.out.println("Local Variable : " + localVariable);
    }
    public static void main(String[] args) {
        int localVariable2 = 400;
        System.out.println("Local Variable : " + localVariable2);
        // To use the instance variable of a class, make object
        // Syntax: ClassName objVariable = new ClassName();
        VariableExample variableExampleObj = new VariableExample();
        // the variable of VariableExample is called object, here variableExampleObj
        variableExampleObj.instanceVariable = 600;
        System.out.println("Intance Variable : " + variableExampleObj.instanceVariable);
        // Static variable can be accessed with, ClassName.variableName
        System.out.println("Static Variable : " + VariableExample.staticVariable);
        VariableExample variableExampleObj2 = new VariableExample();
        variableExampleObj2.instanceVariable = 340;
        System.out.println(variableExampleObj2.instanceVariable);
        VariableExample.staticVariable = true;

        // Java TypeCasting Primitive Datatype
        // Widening Casting/Implicit Casting/ automatic
        // Conversion of smaller datatype to larger datatype (size/capacity)
        // byte -> short -> char -> int -> long -> float -> double
        byte byteVarialbe = 10;
        short shortVariable = byteVarialbe; // here byte is automatically converted to short

        int mathMark = 20;
        double mathConverted = mathMark; // int is automatically converted to double -> 20.0
        System.out.println("Int to double " + mathConverted);

        // Narrowing Casting/Explicit Casting/ Manual
        // Conversion of larger datatype to smaller datatype
        double gpa = 3.4;
        int gpaInt = (int) gpa;
        System.out.println("GPA int " + gpaInt);
        int floatConversion = (int) 400.33f; // 400

        // Calculation
        float mathCalc = 1/2; // 1/2 in int is 0 -> 0.0
        System.out.println(mathCalc); 
        float mathCalcSolve = 1.0f/2; // either one value float
        float mathCalcSolve2 = (float) 1/2; // or manual cast 
        
        /*
         * Task 
         * Make an instance variable firstName
         * Make a new object and print the firstName
         * Calculate and print the following
         * double avg = 13/2
         * float pct = 411/100
         */
    }
}