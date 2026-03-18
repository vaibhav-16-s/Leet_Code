class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        char ch,ch1;
        
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            
            if(st.isEmpty())
                st.push(ch);
            else
            {
                if(st.peek()==ch)
                {
                    st.pop();
                }
                else
                {
                    st.push(ch);
                }
            }
            }
            String s1="";
            while(!st.isEmpty()){
                s1 = st.pop() + s1;
        }
        return s1;
    }
}