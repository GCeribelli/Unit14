package Count2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{   
            grid = new String[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int n = 0; n < cols; n ++){
                    int r = (int)(Math.random() * vals.length);
                    grid[i][n] = vals[r];
                }
            }
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
                String choice = "";
                int max = 0;
                for(int i = 0; i < vals.length; i++){
                    System.out.println(vals[i] + " shows up " + countVals(vals[i]) + " times");
                    if(countVals(vals[i]) > countVals(vals[max]))
                        max = i;
                }
                choice = vals[max];
		return choice;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
                for(String[] n: grid){
                    for(String d: n)
                        if(d.equals(val)){count++;}
                }
                return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
                for(int i = 0; i < grid.length; i++){
                    for(int n = 0; n < grid[i].length; n++){
                        output += grid[i][n];
                    }output += "\n";
                }
		return output;
	}
}