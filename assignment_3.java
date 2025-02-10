public class assignment_3 {

    /**
     * Problem 1: Write a program that prints the numbers from 1 to 100. 
     * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
     * For numbers which are multiples of both three and five print "FizzBuzz".
     */
     public static void fizbuzz_generator() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
     }
    
    /**
     * Problem 2: Write a program that prints the Fibonacci sequence from 0 to 50. 
     * The Fibonacci sequence is a series of numbers where a number is the sum of the two numbers before it. 
     * For example, 0, 1, 1, 2, 3, 5, 8, etc.
    */
    public static void fibonacci_sequence() {
        int count = 50;
        long[] fibonacci = new long[count];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < count; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("The first 50 Fibonacci numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }

    /**
     * 
     * Problem 3: Write a program that gets the maximum value from  a list of three entered integers
     * @int a - first integer
     * @int b - second integer
     * @int c - third integer
     */
    public static int max_value(int a, int b, int c) {
        int highest = 0;
        if (a > highest){
            highest = a;
        }
        if(b > highest) {
            highest = b;
        }
        if(c > highest){
            highest = c;
        }
        // Please replace this with the max integer
        return highest;
    }
    
    public static void main(String[] args) {

        fizbuzz_generator();

        fibonacci_sequence();

        System.out.println("The max value is: " + max_value(93847, 930349, 937289));

        
    }
    
}
