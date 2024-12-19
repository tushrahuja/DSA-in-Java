
public class LeetcodeNo852 {
    public static void main(String[] args) {
      int[] arr = {0, 1, 2, 1, 0};

      System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        
      int lowest = 0;
      int peak = arr.length - 1;

        while (lowest < peak) 
        {
            int mid = lowest + (peak - lowest) / 2;

            if (arr[mid] > arr[mid + 1]) 
            {
                peak = mid;
            }
            else 
            {
                lowest = mid + 1;
            }
        }
        return lowest; 

  }

}
