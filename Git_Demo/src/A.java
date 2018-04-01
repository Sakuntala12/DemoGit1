

public class A {
	
	
	
	public static void main(String[] args) {
		
		boolean flag=false;
	String s1="java12 is great but selenium is also great";
	
	String[] s2=s1.split("\\s");
	System.out.println(s2);

	
	for(int i=0;i<s1.length()-1;i++)
	{
		
		for(int j=1;j<s1.length()-1;j++)
		{
			
			if(s2[i]!=s2[j])
			{
				flag=true;
			}
			
		}
		if(flag==true)
		{
			System.out.println(s2[i]);
		}
		
	}
	}
}
