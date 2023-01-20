import java.util.*;
import java.io.*;
//end of header
public class Main
{
    public static String baseConversion(String number,int sbase,int dbase)
    {
        return Integer.toString(Integer.parseInt(number,sbase),dbase);
    }
	public static void main(String[] args) {
		String number = "1001";
		int sbase = 2;
		int dbase = 10;
		System.out.println("base"+baseConversion(number,sbase,dbase));
		
	}
}
