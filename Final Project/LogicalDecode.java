class LogicalDecode extends orgString
{   
    String decodeStr()
    {
        String[] tokens = str.split("/");
        String newStr = "";
        
        System.out.println("Original Date: "+tokens[0]+"/"+tokens[1]+"/"+tokens[2].charAt(2)+tokens[2].charAt(3));
        
        switch(tokens[0])
        {
            case "1":           newStr = "January "+tokens[1]+", "+tokens[2];
                                break;
            case "2":           newStr = "February "+tokens[1]+", "+tokens[2];
                                break;
            case "3":           newStr = "March "+tokens[1]+", "+tokens[2];
                                break;
            case "4":           newStr = "April "+tokens[1]+", "+tokens[2];
                                break;
            case "5":           newStr = "May "+tokens[1]+", "+tokens[2];
                                break;
            case "6":           newStr = "June "+tokens[1]+", "+tokens[2];
                                break;
            case "7":           newStr = "July "+tokens[1]+", "+tokens[2];
                                break;
            case "8":           newStr = "August "+tokens[1]+", "+tokens[2];
                                break;
            case "9":           newStr = "September "+tokens[1]+", "+tokens[2];
                                break;
            case "10":          newStr = "October "+tokens[1]+", "+tokens[2];
                                break;
            case "11":          newStr = "November "+tokens[1]+", "+tokens[2];
                                break;
            case "12":          newStr = "December "+tokens[1]+", "+tokens[2];
                                break;
            default:            System.out.println("Invalid");
                                break;
        }
        return newStr;
    }
}
