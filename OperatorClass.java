public class OperatorClass {
    public static void main(String[] args) {
        // Arithimatic Operator
        // +, -, *, /, %
        int intVar1 = 10, intVar2 = 20;
        int addOper = intVar1 + intVar2; // 10 + 20
        int minusOper = intVar1 - intVar2; // 10 - 20
        int multOper = intVar1 * intVar2; // 10 * 20
        int divOper = intVar1 / intVar2; // 10 / 20
        int modOper = intVar1 % intVar2; // 10 / 20 (remainder)

        // Assignment Operator
        int assignVar = 10;
        assignVar += 20; // 10 + 20 -> 30
        assignVar -= 15; // 30 - 15 -> 15
        assignVar *= 2; // 15 * 2 -> 30
        assignVar /= 10; // 30 / 10 -> 3
        assignVar %= 2; // 3 % 2 -> 1

        // Unary Operator
        int unaryVar = 20;
        unaryVar ++; // unaryVar += 1; 20 + 1; 21
        unaryVar --; // unaryVar -= 1; 21 - 1; 20

        // Relational Operator
        int relVar1 = 20, relVar2 = 30;
        boolean equalOper = relVar1 == relVar2; // 20 = 30 ? false
        boolean greaterOper = relVar1 > relVar2; // 20 > 30 ? false
        boolean lessEqualOper = relVar2 <= 30; // 30 <= 30? true
        boolean notEqual = 20 != 10; //true

        // Logical Operator
        int logVar1 = 10, logVar2 = 20, logVar3 = 23;
        boolean andOper = true && true;
        boolean andOperVar = (logVar1 < logVar2) && (logVar3 == logVar2); // true && false
        boolean orOper = false || false || true;
        boolean orOperVar = (logVar1 < logVar2) || (logVar3 == logVar2);
        boolean notOper = !(logVar1 < logVar2); // !true -> false

        // Ternary Opeator
        /*
         * String status;
         * int marking = 40;
         * if(marking > 40){
         *   status = "Pass";
         * }else{
         *   status = "Fail";
         * }
         */
        int marking = 40;
        String status = (marking > 40 || true) ? "Pass" : "Fail";
        System.out.println("Status : " + status);

        /*
         * Task
         * Add the following variable
         * oopMarking -> int
         * architectureMarking -> int
         * databaseMarking -> int
         * creativeThinkingMarking -> int
         * make a float avg and calculate the avg of the markings
         * make a boolean expression to check if
         * all the marking is greater or equal to 40
         * and check if the avg is greater than 50
         * Make a result -> String and check the boolean 
         * if true set result as "Good job" else set result as "Bad job"
         * print the result
         */
        int oopMarking = 30;
        int architectureMarking = 40;
        int databaseMarking = 50;
        int creativeThinkingMarking = 45;
        float avg = (float) (oopMarking + architectureMarking 
            + databaseMarking + creativeThinkingMarking) / 4;
        boolean check = oopMarking >= 40 &&
            databaseMarking >=40 && architectureMarking >= 40 &&
            creativeThinkingMarking >=40 && avg >=50;
        String result = check ? "Good Job" : "Bad Job";
        System.out.println(result);
    }
}