package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
    @Test(dataProvider = "GetData")
    public void WebLoginHomeLoan(String userName, String password) {

        System.out.println("Web login home");
        System.out.println(userName);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginHomeLoan"})
    public void MobileHomeLoan() {
        System.out.println("Moblie login home");
    }

    @Test(groups = {"Smoke"})
    public void APILoginLoan() {
        System.out.println("API login home");
    }

    @DataProvider
    public Object[][] GetData() {
        // 1st combination - username, password - good credit history
        // 2nd combination - username, password - no credit history
        // 3rd combination - username, password - fraudulent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "first username";
        data[0][1] = "first password";
        //2nd set
        data[1][0] = "second username";
        data[1][1] = "second password";
        //3rd set
        data[2][0] = "third username";
        data[2][1] = "third password";
        return data;

    }
}
