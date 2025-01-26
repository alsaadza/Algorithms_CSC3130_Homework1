// time complexity: (n^2)

public class commonSubstring {
    public static String findCommonString(String text1, String text2) {
        int maxLength = 0;
        int startIndex = 0;


        for (int i = 0; i < text1.length(); i++) { // O(n)
            for (int j = 0; j < text2.length(); j++) { // O(n)
                int length = 0;


                while (i + length < text1.length() && j + length < text2.length() &&
                        text1.charAt(i + length) == text2.charAt(j + length)) {
                    length++;
                }


                if (length > maxLength) {
                    maxLength = length;
                    startIndex = i;
                }


            }
        }

        if (maxLength > 0) {
            return text1.substring(startIndex, startIndex + maxLength);
        } else {
            return "";
        }
    }

    public static void main(String args[]){
        commonSubstring algorithm = new commonSubstring();

        String text1 = "abc";
        String text2 = "abc";
        String result = algorithm.findCommonString(text1, text2);
        System.out.println("Case 1:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");


        text1 = "almanacs";
        text2 = "albatross";
        result = algorithm.findCommonString(text1, text2);
        System.out.println("Case 2:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");


        text1 = "gears of war";
        text2 = "History of warriors";
        result = algorithm.findCommonString(text1, text2);
        System.out.println("Case 3:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");

        text1 = "esteban is a great professor";
        text2 = "zain is a great student";
        result = algorithm.findCommonString(text1, text2);
        System.out.println("Case 4:\ntext1 = " + text1 + " \n text2 = " + text2 + "\n Output: " + result);
        System.out.println("---------------------------------------------------");



    }

}
