import java.util.*;
import java.io.*;
import java.nio.file.*;

public class State implements Comparable<State>
{
//Git test push 
    private static int[] board = new int[14];
    private int hValue;

    public State(int[] board)
    {
        // DO SOMETHING???
    }

    @Override
    public int compareTo(State o)
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public int get_hVlaue()
    {
        return hValue;
    }

    public void setH(int new_hValue){
        
        this.hValue = new_hValue;
    }

    
    public int[] readStartStateFromFile(String filename){
        try
        {
            String filePath = "C:/Users/lboth/Desktop/inputB.txt/";
            File file = new File(filePath);
            Scanner scan = new Scanner(file);

            // Read the file line by line
            while (scan.hasNextLine())
            {
                for(int i = 1; i <=14; i++){
                String line = scan.nextLine();
                int number = Integer.parseInt(line);
                board[i] = number;
                }
                
                
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (NumberFormatException s) {
            System.out.println("Invalid number format: " + s.getMessage());
        }
        return board;
    }
}