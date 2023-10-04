import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {

        ArrayList<Integer> s = new ArrayList<>();
        for(int i =  0;i<arr.length ; i++)
        {
            s.add(arr[i]);
        }
        for(int i = 0 ;i<arr.length ; i++)
        {
            
            int ele = 2*arr[i];
            if(ele==0)
            {
                s.remove(Integer.valueOf(ele));
            }
            if(s.contains(ele))
            {
                  return true;
            }

        }
        return false;
        
    }
}