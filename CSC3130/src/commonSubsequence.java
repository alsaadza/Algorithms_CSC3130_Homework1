public class commonSubsequence {

    public int findCommonSubsequence(String text1, String text2) {
        int output = 0;

        char[] textArray1 = text1.toCharArray();
        char[] textArray2 = text2.toCharArray();

        for (int i = 0; i < textArray1.length; i++) {
            for (int j = 0; j < textArray2.length; j++) {
                if(textArray1[i] == textArray2[j]) {

                    output++;
                    textArray2 = new String(textArray2, (j + 1), (textArray2.length - (j + 1))).toCharArray();
                    // in line 14 I am creating a new string starting from the character after the match (j + 1) so I can convert it back into a character array.
                    break;
                }
                else{

                }
            }
        }

        return output;
    }

    public static void main(String args[]){
        commonSubsequence algorithm = new commonSubsequence();

        String text1 = "abc";
        String text2 = "abc";
        int result = algorithm.findCommonSubsequence(text1, text2);
        System.out.println("Case 1:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");


        text1 = "almanacs";
        text2 = "albatross";
        result = algorithm.findCommonSubsequence(text1, text2);
        System.out.println("Case 2:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");


        text1 = "almanac";
        text2 = "ferris";
        result = algorithm.findCommonSubsequence(text1, text2);
        System.out.println("Case 3:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");


    }
}
