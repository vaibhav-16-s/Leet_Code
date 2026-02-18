class Solution {
    public String reverseVowels(String s) {
        char[] vw=s.toCharArray();
        int right=s.length()-1;
        int left=0;

        while(left<right)
        {
            while(left<right && ! isVowel(vw[left]))
                left++;
            while(left<right && ! isVowel(vw[right]))
                right--;   
        
            char temp=vw[left];
            vw[left]=vw[right];
            vw[right]=temp;
            left++;
            right--;
        }
        return new String(vw);
    }
     private boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}