package Recursion;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
                if(num > 0){
                    int x = num % 10;
                    num /= 10;
                    if(x % 2 == 1){
                        return countOddDigits(num) +1;
                    }else{return countOddDigits(num);}
                }
                else{return 0;}

		
	}
}