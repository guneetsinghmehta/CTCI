public class Solution {
    public String removeDuplicateLetters(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int index=(int)s.charAt(i)-97;
            if(a[index]==0){a[index]=1;}
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(a[i]==1)
            {
                sb.append((char)(i+97));
            }
        }
        return sb.toString();
    }
}