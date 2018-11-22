import java.util.ArrayList;
import java.util.List;

public class DataDriven {
	public Foo InitFoo()
	{
		 Foo foo=new Foo();
		 List<Bar> barList = new ArrayList<Bar>();
		 foo.setName("*** system");
		 Bar bar1=new Bar();
		 bar1.setId("123");
		 bar1.setCode("code123");
		 barList.add(bar1);
		 bar1.setId("456");
		 bar1.setCode("code456");
		 barList.add(bar1);
		 bar1.setId("789");
		 bar1.setCode("code789");
		 barList.add(bar1);
		 return foo;
	}
}
