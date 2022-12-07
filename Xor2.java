import java.util.*;
class Xor2
{
	public static void main(String[] args)
	{
		final int number=127;
		Scanner scanner = new Scanner(System.in);
		char[] plainText = scanner.nextLine().toCharArray();
		ArrayList<Character> CipherTextAND = new ArrayList<>(plainText.length);
		ArrayList<Character> CipherTextOR = new ArrayList<>(plainText.length);
		ArrayList<Character> CipherTextXOR =new ArrayList<>(plainText.length);
		for(char Character : plainText)
		{
			CipherTextAND.add((char)((int)Character&number));
			CipherTextOR.add((char)((int)Character|number));
			CipherTextXOR.add((char)((int)Character^number));
		}
		for(char Character:CipherTextAND) {
			System.out.print(Character);
		}
		for(char Character:CipherTextOR) {
			System.out.println(Character);
		}
		for(char Character:CipherTextXOR) {
			System.out.println(Character);
		}
		System.out.println();
	}
}
