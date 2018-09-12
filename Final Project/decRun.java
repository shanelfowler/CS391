import java.util.Scanner;
class decRun
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //orgString obj = new orgString();
        int choice;
        String user;
        
        System.out.print("\t\t\tWelcome to the decode program!"+
                        "\n\t\t ==================================="+
                        "\n\nChoose your decode method:"+
                        "\n\t\t1)Logical Date"+
                        "\n\t\t2)Run Length"+
                        "\n\t\t3)Huffman"+
                        "\nSelection: ");
        choice = input.nextInt();
        switch(choice)
        {
            case 1:             System.out.println("You have selected logical date.");
                                break;
            case 2:             System.out.println("You have selected run length.");
                                break;
            case 3:             System.out.println("You have selected huffman.");
                                break;
            default:
                                System.out.println("Invalid entry. Good-bye!");
                                break;
        }
        input.nextLine();
        
        if(choice == 1)
        {
            LogicalDecode obj = new LogicalDecode();
            
            System.out.print("Enter Date (M/D/YYYY): ");
            user = input.nextLine();
          
            obj.setString(user);
            System.out.println("Date: "+obj.decodeStr());
        }
        if(choice == 2)
        {
            RunLength obj = new RunLength();
            
            System.out.print("Enter encoded string ($4A$2BC): ");
            user = input.nextLine();
            
            obj.setString(user);
            System.out.println("Decoded String: "+obj.decStr());
        }
        if(choice == 3)
        {
            Huffman obj = new Huffman();
            
            System.out.print("Enter encoded string (E = 00, A = 01, O = 10, U = 11): ");
            user = input.nextLine();
            
            obj.setString(user);
            System.out.println("Decoded String: "+obj.dStr());
        }
    }
}