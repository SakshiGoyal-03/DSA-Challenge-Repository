import java.util.*;
class Solution2 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
            {
                s.remove(nums[i]);
            }
            else
            {
                return nums[i];
            }
        }
        return 0;
    } 
}