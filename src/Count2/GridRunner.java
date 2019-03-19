package Count2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
            String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
            Grid g = new Grid(8, 8, vals);
            System.out.println(g.toString());
            System.out.println();
            System.out.println("Most common digit: " + g.findMax(vals));
        }
}