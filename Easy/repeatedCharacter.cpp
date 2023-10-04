class Solution {
public:
    char repeatedCharacter(string s) {
        int count[26] = {0};
        for(int i = 0;i < s.size() ; i++)
        {
            if(s[i] >= 'a' && s[i]<='z')
            {
                count[s[i]-'a']++;
                if(count[s[i]-'a'] >=2)
                {
                    return s.at(i);
                }
            }
        }
        return 'a';
    }
};