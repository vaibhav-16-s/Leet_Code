class Solution {
    public String reversePrefix(String word, char ch) {
        int x=-1;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                x=i;
                break;
            }
        }
        StringBuilder s1=new StringBuilder();
         if (x == -1) {
            return word;
        }
        for(int i=x;i>=0;i--)
        {
            s1.append(word.charAt(i));
        }
        s1.append(word.substring(x + 1));
        
        return s1.toString();
    }
}