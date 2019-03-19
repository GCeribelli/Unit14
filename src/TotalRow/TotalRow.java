package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static ArrayList<Integer> getRowTotals( int[][] m )
    {
        int sum = 0;
    	ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < m.length; i++){
            for(int n = 0; n < m[i].length; n++){
                sum += m[i][n];
            }a.add(sum);
            sum = 0;
        }
        return a;
    }
}
