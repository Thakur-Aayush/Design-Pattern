package problems;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// Ques: To find immediate greater number of the provided number.
// Approach: Follow these steps
// 1. Start from last and find the digit smaller than last digit.
// 2. Swap those digits.
// 3. Then sort the digits after that index till last to ascending order.

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Integer number = 73798;
        int[] digits = getDigits(number);
        int length = digits.length - 1;
        int index = digits.length - 1;
        while(index >= 0){
            if(digits[length] > digits[index]) {
                processArray(digits, index, length);
                break;
            }
            index--;
        }
        logger.log(Level.INFO, "Result = {0}", Arrays.toString(digits));
    }
    
    private static int[] getDigits(Integer number) {
        String[] temp = number.toString().split("");
        int[] digits = new int[temp.length];
        for(int i = 0; i < temp.length; i++) {
            digits[i] = Integer.parseInt(temp[i]);
        }
        return digits;
    }
    
    private static void processArray(int[] digits, int index, int length) {
        int temp = digits[index];
        digits[index] = digits[length];
        digits[length] = temp;
        Arrays.sort(digits, ++index, ++length);
    }
}
