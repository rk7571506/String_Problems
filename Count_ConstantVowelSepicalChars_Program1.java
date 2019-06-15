/*
	Count Vowel,Constant & Speical Symbols. Only LowerCase TestCase
	Input:
	      aradhya's brilliance center
	Output:
		Vowel: 9
		Constant: 15
		Special Character:3
*/
class Count_ConstantVowelSepicalChars_Program1 
{
	public static void main(String[] args) 
	{
		String x = "aradhya's brilliance center";
		char y[] = x.toCharArray();
		int i=0;
		int size=y.length;
		int vowcnt=0;
		int conscnt=0;
		int spicnt=0;

		while(i!=size)
		{
			if(y[i]>='a' && y[i]<='z')
			{
				if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u')
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

