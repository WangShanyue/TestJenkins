import java.io.IOException;
import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;



/**
 * 
 * @author wsy
 * @version 2018��10��27��
 */

public class DigTest
{

	public  Boolean Login (Foo foo,String ID,String Code)
	{
		

		Boolean result=false; 
		for (Bar bar : foo.getBarList())
         {
           //  if(ID.equals(bar.getId()))  //*****ע��һ������ʹ��ֻ�ж������Ƿ������xml�ļ��ж������ж��Ƿ�����Ӧ��ID��Ӧ
      //      {
            	 if(Code.equals(bar.getCode()))
            		{
            		 result=true;
            		 break;
            		} 
          //  }
         }
		return result;
	}
	
    public   Foo LoadData()
    {

        try
        {
         
            Digester digester = new Digester();

            digester.setValidating(false);

            digester.addObjectCreate("foo", "digesterTest.Foo");
            digester.addSetProperties("foo");
            digester.addObjectCreate("foo/bar", "digesterTest.Bar");
            digester.addSetProperties("foo/bar");
            digester.addSetNext("foo/bar", "addBar", "digesterTest.Bar");
       
            Foo foo = (Foo) digester.parse(DigTest.class.getResourceAsStream("example.xml"));
            
  //          System.out.println("Welcome to the "+foo.getName()+"! Please log in first:");
            return foo;
           
            
            
        }
        catch (IOException e)
        {

            e.printStackTrace();
        }
        catch (SAXException e)
        {

            e.printStackTrace();
        }
        return null;
    }
    
    public void Results(Foo foo,Boolean lab)
    {
    	if(lab)
    	System.out.println("Welcome to the "+foo.getName()+"!");
    	else
    	System.out.println("Log in defeated!");
    }
}