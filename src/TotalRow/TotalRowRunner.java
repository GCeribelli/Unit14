package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;
public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
                int[][] a = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
                ArrayList<Integer> x = new ArrayList<Integer>();
		TotalRow m = new TotalRow();
                x = m.getRowTotals(a);
                for(int i: x)
                    System.out.println(i);
                
	}
}



