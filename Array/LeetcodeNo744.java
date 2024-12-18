
public class LeetcodeNo744 {

    public static void main(String[] args) {
        // Initializing the array in ascending order
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';  // Target value to search for

        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target > letters[end]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }

}
