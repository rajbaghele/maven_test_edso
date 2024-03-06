package AlwaysRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {
    @Test(groups ={"Smoke"} ) //if the method 1 is pass so method will execute
    public void method() {
        Assert.assertTrue(false);
        System.out.println("login appication ");
    }
    @Test(dependsOnGroups ={"Smoke"},alwaysRun = true)
    public void method1() {

        System.out.println("login appication2 ");
    }
    @Test()
    public void method2() {

        System.out.println("login appication3 ");
    }
}
