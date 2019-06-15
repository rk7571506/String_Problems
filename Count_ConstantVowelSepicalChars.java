/*
	Count Vowel,Constant & Speical Symbols. Only UpperCase TestCase
	Input:
	      ARADHYA'S BRILLIANCE CENTER
	Output:
		Vowel: 9
		Constant: 15
		Special Character:3
*/
class Count_ConstantVowelSepicalChars 
{
	public static void main(String[] args) 
	{
		String x = "ARADHYA'S BRILLIANCE CENTER";
		char y[] = x.toCharArray();
		int i=0;
		int size=y.length;
		int vowcnt=0;
		int conscnt=0;
		int spicnt=0;

		while(i!=size)
		{
			if(y[i]>='A' && y[i]<='Z')
			{
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U')
				{
					vowcnt++;
				}else
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

	}
}
