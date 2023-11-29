package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
    @Test(groups = {"Smoke"})
    public void WebLoginCarLoan() {
        System.out.println("Web login car");
    }

    @Test(enabled = false)
    public void MobileLoginCarLoan() {
        System.out.println("Mobile login car");
    }

    @Test
    public void APILoginCarLoan() {

        System.out.println("API login car");
        Assert.assertTrue(false);
    }

    @BeforeTest
    public void ExecuteFirst() {
        System.out.println("First execution");
    }
}
