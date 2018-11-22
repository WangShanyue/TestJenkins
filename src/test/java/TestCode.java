

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
//import org.junit.Test;
class TestCode {

	@Test
	void test1() {  //�Ի�����ݷ����Ĳ���(����commens���Ĳ���)
		
		DigTest digetst=new DigTest();
		Foo foo=digetst.LoadData();
		System.out.println("The patrent name is:"+foo.getName());
	
			 for (Bar bar1 : foo.getBarList())
	            {
	                System.out.println(bar1.getId() + "," + bar1.getCode());
	            }
	
	}

	@Test
	void test2() {
		
		DigTest ditest=new DigTest();
		Foo foo=ditest.LoadData();
		 foo.setName("*** system");
		 ditest.Results(foo,true);
		 ditest.Results(foo,false);
	}

	@Test
	void test3() {
		
		DigTest ditest=new DigTest();
		Foo foo=ditest.LoadData();
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
		 System.out.println(ditest.Login(foo, "123", "code456"));
	
	}
	@Test
	void test4() {
		
		DigTest ditest=new DigTest();
		Foo foo=ditest.LoadData();
		ditest.Results(foo, ditest.Login(foo, "123", "code234"));
	}

	@Test
	void test5() {
		
		DigTest ditest=new DigTest();
		Foo foo=ditest.LoadData();
		ditest.Results(foo, ditest.Login(foo, "123", "code234"));
	}
}
