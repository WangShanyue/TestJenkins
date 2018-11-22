import org.junit.jupiter.api.Test;

public class DigTestTest {



    public void login() {

    }

    @Test
    public void loadData() {
        DigTest digetst=new DigTest();
        Foo foo=digetst.LoadData();
        System.out.println("The patrent name is:"+foo.getName());

        for (Bar bar1 : foo.getBarList())
        {
            System.out.println(bar1.getId() + "," + bar1.getCode());
        }
    }


    public void results() {
    }
}
