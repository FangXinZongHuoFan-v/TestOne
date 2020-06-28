package test;

import java.util.ArrayList;

/**
 * @author xufanxuan
 * @date 2020年5月17日
 */
public class test {
	
	
	public static int maximumGap(int[] nums) {

        //TODO
		if(nums.length > 2) {
			int result_one;
			int result_other;
			for (int i = 0; i < nums.length; i++) {
				result_one = nums[i]-nums[i+1];
				result_other = nums[i+1]-nums[i+2];
				// 比较需要获取加绝对值之后，这一点没记住，不好意思！！
				if (result_one > result_other) {
					System.out.println(result_one);
				}
			}
		}
        
		return 0;
    }
	
	
	public static void main(String[] args) {
		int[] num = {1,2,5,7,10,19};
		maximumGap(num);
	}
}
