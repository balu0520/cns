import java.io.*;
import java.util.*;

class Xor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		char[] plainText = scanner.nextLine().toCharArray();
		ArrayList<Integer> CipherText = new ArrayList<>(plainText.length);
		for(char Character : plainText)
		{
   
			CipherText.add((int)Character^0);
		}
		System.out.print(CipherText);
	}
}
