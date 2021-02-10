import static java.lang.System.out;

class Boxing
{
	static public void main(String...ar)
	{
		Integer ref1=1235;
		Integer ref2=7875;
		int arg1=ref1;
		int arg2=ref2;
	if(arg1==arg2)
		{
			out.println("Same");
		}
	else
		{
			out.println("Not Same");
		}
		int ref3=101010;
		Integer ref4=ref3;
	if(ref4.equals(ref2))
		{	
			out.println("Same");
		}
	else
		{
			out.println("Not Same");
		}
	}
}