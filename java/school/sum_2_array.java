import java.util.Arrays;

public class sum_2_array {

    public static int[] find_sum_in_array(int[] nums, int target){
        for(int curr_idx = 0; curr_idx < nums.length; curr_idx++){
            for(int fullParse_idx = curr_idx; fullParse_idx < nums.length; fullParse_idx++){
                if((nums[curr_idx] + nums[fullParse_idx] == target) && (curr_idx != fullParse_idx)){
                    return (curr_idx < fullParse_idx) ? new int[] {curr_idx, fullParse_idx} : new int[] {fullParse_idx, curr_idx};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find_sum_in_array(new int[] {3,2,4}, 6)));
    }
}
