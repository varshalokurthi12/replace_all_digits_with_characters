class Solution {
    public String replaceDigits(String s) {
     char[] ch=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
               
            if(Character.isDigit(ch[i]))
            {
                ch[i]=(char)(ch[i-1]+Character.getNumericValue(ch[i]));
            }
            
        }
        return String.valueOf(ch);
    }
}