import static java.lang.System.out;
import java.util.Scanner;

class JavaMarksException extends RuntimeException
{
JavaMarksException()
{
}
}

class CMarksException extends RuntimeException
{
CMarksException()
{
}
}

class Marks
{
void getMarks()
{
Scanner sc=new Scanner(System.in);
out.println("Enter java marks:");
float javaMarks=sc.nextFloat();
if(javaMarks<0 || javaMarks>100)
	{
	JavaMarksException ex=new JavaMarksException();
	throw ex;
	}
	else
	{
	out.println("Good!!!!");
	}


out.println("Enter c marks:");
float cMarks=sc.nextFloat();
if(cMarks<0 || cMarks>100)
	{
	CMarksException ex=new CMarksException();
	throw ex;
	}
	else
	{
	out.println("Good!!!!");
	}
}
}

class EHDemo
{
static public void main(String...ar){

Marks m=new Marks();
try
{

m.getMarks();
}
catch(JavaMarksException | CMarksException obj)
{
obj.printStackTrace();
out.println("Marks are not in range");
}
finally
{
out.println("connecting!!!!!!!");
}
}
}