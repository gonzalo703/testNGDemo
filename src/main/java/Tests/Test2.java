package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test2 {
    @Parameters({"URL", "Username"})
    @Test
    public void SecondTest(String urlName, String userName) {

        System.out.println("Second test");
        System.out.println(urlName);
        System.out.println(userName);

    }
}
