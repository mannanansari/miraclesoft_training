import java.util.Arrays;
import java.util.Collections;
public class MaximumGap {
	public static int maximumGap(int[] nums) {
        int temp;
        int max = 0;
        int gap;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
               if(nums[i]>nums[j]) {
                   temp=nums[i];
                   nums[i]=nums[j];
                   System.out.println(nums[i]+" "+nums[j]);
                   nums[j]=temp;
               }
                
                
            }
             gap=nums[i+1]-nums[i];
                max = Collections.max(Arrays.asList(gap));
            
        }
        //return max;
        //return nums;
		return max;
    }
	public static void main(String[] args) {
		int[] nums= {12,45,32,43};
		MaximumGap.maximumGap(nums);
		
	}
	

}
