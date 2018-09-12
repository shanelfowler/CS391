class Huffman extends orgString
{
    String dStr()
    {
        String newStr = "";
        int counter = 0;
        
        while(counter < str.length())
        {
            if(str.charAt(counter) == '0' && str.charAt(counter+1) == '0')
                newStr += "E";
            if(str.charAt(counter) == '0' && str.charAt(counter+1) == '1')
                newStr += "A";
            if(str.charAt(counter) == '1' && str.charAt(counter+1) == '0')
                newStr += "O";
            if(str.charAt(counter) == '1' && str.charAt(counter+1) == '1')
                newStr += "U";
            counter += 2;
        }
        return newStr;
    }
}
