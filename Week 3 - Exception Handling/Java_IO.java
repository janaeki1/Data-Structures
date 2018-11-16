
import java.util.*;
import java.io.*;
import java.lang.*;

public class Java_IO {

	public static void main(String[] args) {

		getinput2();
		writing();

	}
	
	public static void getinput2() {
         String input;
         Scanner fileinput = null;
      // File inFile = new File("c:\\csc2310\\test.txt");
     //  File inFile = new File("c:\\cdrive_may_04\\csc2310\\test.txt");
         File inFile = new File("C:\\Users\\Jerome\\Desktop\\test.txt");
         
         try
         {
           fileinput = new Scanner(inFile);
           while(fileinput.hasNextLine())
           {
               input = fileinput.nextLine();
               System.out.println(input);
           }
           fileinput.close();
         }catch(FileNotFoundException e)
         {
           System.out.println(e);
           System.exit(1);
         }
         finally
         {
             fileinput.close();
         }
         
    }

	public static void writing()
    {
        PrintWriter output = null;
        try
        {
           output = new PrintWriter(new FileWriter("C:\\Users\\Jerome\\Desktop\\results.txt"));
           output.println("This is to test to see if we can write to a file.");
           output.println("And also be able to write multiple lines.");
        }catch(IOException e)
        {
            System.out.println(e);
            System.exit(1);
        }
        finally 
        {
           output.close(); 
        } 
    }

}
