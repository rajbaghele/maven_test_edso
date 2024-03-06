package annotation;

import org.testng.annotations.Test;

public class DependOnMethodExample {
    @Test(dependsOnMethods ={"method1"} ) //if the method 1 is pass so method will execute
    public void method() {

        System.out.println("login appication ");
    }
    @Test()
    public void method1() {

        System.out.println("login appication2 ");
    }
    @Test()
    public void method2() {

        System.out.println("login appication3 ");
    }
}
