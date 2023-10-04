class Solution {
    public String mergeAlternately(String word1, String word2) {

        String a = "";
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n  = word2.length();
        while(i<m && j<n)
        {
            a = a+word1.charAt(i);
            a = a+word2.charAt(j);
            i++;
            j++;
        }
        while(i<m)
        {
             a = a+word1.charAt(i);
             i++;
        }
        while(j<n)
        {
             a = a+word2.charAt(j);
             j++;
        }
        return a;
    }
}