import java.util.Date;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.text.DateFormat;

class DateCode
{
	static public void main(String...ar)throws IOException
	{
	Date date=new Date();
	DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
	JOptionPane.showMessageDialog(null,"Welcome Today is : "+df.format(date));
	}

	





}


