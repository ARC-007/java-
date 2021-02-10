import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Concept<kyale,longi,kuchbhi> extends java.lang.Object
{
kyale first;
longi second;
kuchbhi third;
void set(kyale arg1,longi arg2,kuchbhi arg3)
	{
	first=arg1;			
	second=arg2;
	third=arg3;
	}	
	void show()	
	{
	out.println(first+" "+second+" "+third);	
	}
}
/*class LetsSee
{
static public void main(String...ar)
	{	
	Concept ref=new Concept();
	ref.set(56.55,555,"abc");
	ref.show();
	ref.set(5.555,565,"xyz");
	ref.show();
	}
}
*/
class LetsSee
{
static public void main(String...ar)
	{
	Concept<Integer,Integer,String> ref=new Concept<Integer,Integer,String>();
	ref.set(56,55,"asf");
	ref.show();	
	ref.set(5,5656,"dsagdf");
	ref.show();
	}	
}


	
