class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String s : operations)
        {
            if(s.charAt(1) == '+')
            {
                value+=1;
            }
            else{
                value-=1;
            }
        }
        return value;
    }
}