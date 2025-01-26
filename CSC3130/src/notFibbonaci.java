import java.util.*;

public class notFibbonaci {

    public long[] generateNotFibonacci(int numTerms) {

        long[] sequence = new long[numTerms];

        sequence[0] = 0;
        if (numTerms > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < numTerms; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2] + 1;
        }

        return sequence;
    }


    //this method prints out the long[] array such that it could be properly output on the terminal.
    public static void printArray(long[] array) {
        System.out.print("[");
        for (long num : array) {
                System.out.print(num + ", ");
            }
        System.out.print("]");
        }


    public static void main(String args[]){
        notFibbonaci algorithm = new notFibbonaci();

        int input = 5;
        long[] output = algorithm.generateNotFibonacci(input);
        System.out.println("Case 1:\nInput = " + input + "\n Output: ");
        printArray(output);
        System.out.println();
        System.out.println("---------------------------------------------------");

        input = 10;
        output = algorithm.generateNotFibonacci(input);
        System.out.println("Case 2:\nInput = " + input + "\n Output: ");
        printArray(output);
        System.out.println();
        System.out.println("---------------------------------------------------");

        input = 20;
        output = algorithm.generateNotFibonacci(input);
        System.out.println("Case 3:\nInput = " + input + "\n Output: ");
        printArray(output);
        System.out.println();
        System.out.println("---------------------------------------------------");


    }

}
