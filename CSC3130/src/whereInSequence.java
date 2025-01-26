import java.util.*;


public class whereInSequence {




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

        //added method
        public static int findPosition(long num, long[] sequence) {

            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i] == num) {
                    return i + 1;
                }
            }
            int output = 0;
            for (int i = 0; i < sequence.length; i++) {

                if (sequence[i] < num) {

                    output = i + 1;

                }
                else {
                    break;
                }
            }

            return output;
        }


        public static void main(String args[]){
            whereInSequence algorithm = new whereInSequence();

            int input = 5;
            long[] output = algorithm.generateNotFibonacci(input);
            System.out.println("Input = " + input + "\n Output (position 1) = "+ algorithm.findPosition(1, output));
            System.out.println();
            System.out.println("---------------------------------------------------");

            input = 10;
            output = algorithm.generateNotFibonacci(input);
            System.out.println("Input = " + input + "\n Output (position 3) = "+ algorithm.findPosition(3, output));
            System.out.println();
            System.out.println("---------------------------------------------------");

            input = 15;
            output = algorithm.generateNotFibonacci(input);
            System.out.println("Input = " + input + "\n Output (position 6) = "+ algorithm.findPosition(6, output));
            System.out.println();
            System.out.println("---------------------------------------------------");


        }



}
