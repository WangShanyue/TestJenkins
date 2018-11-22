import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class MyDig {
	  public void drive()
	  {
		  File file= new File("c://example.xml");

		  try {
			  Foo foo= parse( file );
		  } catch (IOException e) {
			  e.printStackTrace();
		  } catch (SAXException e) {
			  e.printStackTrace();
		  }

	  }
	  
	  
	  public <T> T parse( File file )
		        throws IOException, SAXException
		    {
		        if ( file == null )
		        {
		            throw new IllegalArgumentException( "File to parse is null" );
		        }

		        InputSource input = new InputSource( new FileInputStream( file ) );
		        input.setSystemId( file.toURI().toURL().toString() );

		        return ( this.<T> parse( input ) );
		    }
	  
	  public <T> T  parse(InputSource source)
	  {
		  System.out.println("You have called the stub");
		  return null;
	  }

}
