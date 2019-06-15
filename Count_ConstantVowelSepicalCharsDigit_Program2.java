/*
	Count Vowel,Constant & Speical Symbols, Digit Only LowerCase TestCase
	Input:
	      $RaVI's % Is % best 100 %%%%%@@@
	Output:
		Vowel: 4
		Constant: 7 
		Special Character: 18
		Digit Count: 3
*/
class Count_ConstantVowelSepicalCharsDigit_Program2 
{
	public static void main(String[] args) 
	{
		String x = "$RaVI's % Is % best 100 %%%%%@@@";
		char y[] = x.toCharArray();
		int i=0;
		int size=y.length;
		int vowcnt=0;
		int conscnt=0;
		int spicnt=0;
		int digitcnt=0;

		while(i!=size)
		{
			if((y[i]>='a' && y[i]<='z')|| (y[i]>='A' && y[i]<='Z')||(y[i]>='0' && y[i]<='9'))
			{
				if((y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') || (y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U'))
				{
					vowcnt++;
				}
				else if(y[i]>='0' && y[i]<='9')
				{
						digitcnt++;
				}
				else
				{
					conscnt++;
				}
			}else
			{
				++spicnt;
			}
			++i;
		}

		System.out.println("Vowel:"+ vowcnt);
		System.out.println("Constant:"+ conscnt);
		System.out.println("Special Charchater:"+ spicnt);
		System.out.println("Digits:"+digitcnt);
	}
}

