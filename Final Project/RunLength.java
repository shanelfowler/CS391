class RunLength extends orgString
{
    String decStr()
    {
        String temp = "";
        int n = 0;
        while(n < str.length() - 1)
        {
            if(str.charAt(n) == '$')
            {
                for(int i = 0; i < Character.getNumericValue(str.charAt(n+1)); i++)
                    temp += str.charAt(n+2);
                n+= 3;
            }   
            if(str.charAt(n) != '$')
            {
                temp += str.charAt(n);
                n++;
            }
        }
        return temp;
    }
}
