package template;

import org.junit.*;

public class TestingBasic {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Actions to execute before all @Test in the class");
    }

    @Before
    public void before(){
        System.out.println("Actions to execute before each @Test");
    }

    @Test
        public void tittleTest1P(){
        System.out.println("Test Case 1 - Steps - Verifications");


    }
      @Test
        public void tittleTest1PA(){
        System.out.println("Test Case 1 - Steps - Verifications");


    }
//    @Test(timeout = 1000)
//    public void tittleTest1(){
//        System.out.println("Test Case 1 - Steps - Verifications");
//
//
//    }

//    @Ignore("BUG111")
//    @Test
//    public void tittleTest2(){
//        System.out.println("Test Case 2 - Steps - Verifications");
//    }
//
//    @Test (expected = ArithmeticException.class)
//    public void tittleTest3(){
//        System.out.println("Test Case 3 - Steps - Verifications");
//    }

    @After
    public void after(){
        System.out.println("Actions to execute after each @Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Actions to execute after all @Test in the class");
    }

}
