package YEAR_II;
import java.util.Scanner;

public class YearIImarks {
    public void display()
    {
        Scanner obj=new Scanner(System.in);
        int sub3mark=obj .nextInt();
        int sub4mark=obj.nextInt();
        System.out.println("Mark3"+sub3mark);
        System.out.println("Mark4"+sub4mark);
        if(sub3mark>50)
        {
            System.out.println("Pass");
            
        }   
        else
        {
            System.out.println("Fail");
            
        }    
        if(sub4mark>50)
        {
            System.out.println("Pass");
            
        }   
        else
        {
            System.out.println("Fail");
        }    
    }        
    
}
