package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = {"Smoke"})
    public void FirstTest() {
        System.out.println("First test");
    }

    @AfterTest
    public void LastExecution() {
        System.out.println("Last execution");
    }

}
