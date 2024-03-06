package annotation;

import org.testng.annotations.Test;

public class PriortyClass {
    @Test
    public void tC_A(){
        System.out.println("Test case A");
    }
    @Test(priority = 1)
    public void tC_B() {
        System.out.println("Test case B");
    }
    @Test(priority= 2)
    public void tC_C(){
        System.out.println("Test case C");
    }
    @Test
    public void tC_D(){
        System.out.println("Test case D");
    }
    @Test(priority ='a')
    public void tC_E(){
        System.out.println("Test case E");
    }
    @Test(priority=0)
    public void tC_F(){
        System.out.println("Test case F");
    }
    @Test
    public void tC_G(){
        System.out.println("Test case G");
    }
}


