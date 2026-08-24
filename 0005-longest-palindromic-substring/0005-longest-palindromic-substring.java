class Solution {
    public String longestPalindrome(String s)
    {
        if(s.length() <= 1) return s;
        String res = s.substring(0,1);
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            String odd = expand(s,i,i);
            String even = expand(s,i,i+1);
            if(odd.length()>res.length()) res = odd;
            if(even.length()>res.length()) res = even;
        }
        return res; 
    }
    public String expand(String s , int l, int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;r++;
        }
        return s.substring(l+1,r);
    }
}
