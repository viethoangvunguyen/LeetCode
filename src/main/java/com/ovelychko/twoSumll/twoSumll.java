import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * 
 */
public class TwoSumII {


    static public int[] twoSum(int[] numbers, int target) {
        
        // **** initialization ****
        int l   = 0;
        int r   = numbers.length - 1;

        // **** compute sum converging from left and right ****
        while (l < r) {

            // **** compute sum ****
            int sum = numbers[l] + numbers[r];

            // ???? ????
            System.out.println("<<< l: " + l + " r: " + r + " sum: " + sum);

            // **** check how to proceed ****
            if (sum == target)
                return new int[] {l + 1, r + 1};
            else if (sum > target)
                r--;                // go left
            else
                l++;                // go right
        }

        // **** should NOT occur based on requirements ****
        return null;
    }


    /**
     * Test Scaffold
     * @throws IOException
    */
    public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read int[] numbers ****
        int[] numbers = Arrays.stream(br.readLine().trim().split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        // **** read int target ****
        int target = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<< numbers: " + Arrays.toString(numbers));
        System.out.println("main <<< target: " + target);

        // **** call function of interest and display output ****
        System.out.println("main <<< output: " + Arrays.toString(twoSum(numbers, target)));
    } 
}