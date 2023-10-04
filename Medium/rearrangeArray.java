class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p = 0;
        int n = 0;
        for(int i=0;i<nums.length;i++ )
        {
            if(nums[i] > 0)
            {
               pos[p] = nums[i];
               p++;
            }
            else{
                neg[n] = nums[i];
                n++;
            }
        }
        p = 0;
        n = 0;
        for(int i = 0;i<nums.length;i+=2)
        {
            nums[i] = pos[p];
            nums[i+1] = neg[n];
            p++;
            n++;
        }
        return nums;
    }
}