package Count1;
import java.util.Arrays;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
                MatrixCount1 a1 = new MatrixCount1();
                for(int[] row: a1.getM()){
                   System.out.println(Arrays.toString(row));
                }
		System.out.println("Number of 7's:: " + a1.count(7));
                System.out.println("Number of 6's:: " + a1.count(6));
                System.out.println("Number of 5's:: " + a1.count(5));
                System.out.println("Number of 4's:: " + a1.count(4));
	}
}



