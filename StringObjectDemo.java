class StringObjectDemo
{
	public static void main(String[] args)
	{
		String str=new String("KleTech");
		String str1=new String("KleTech");
		String str2="BVB";
		String str3="bvb";
		System.out.println(str2.equals(str3)); //checks content
		System.out.println(str==str1); //checks if both variables are pointing to same object
		System.out.println(str2==str3); //Since here the strings are literals and have same content they point to same memory location
		str1=str; //str1 points to the location pointed by str
		System.out.println(str==str1);
	}
}