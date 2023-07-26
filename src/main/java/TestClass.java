public class TestClass {


    public boolean tester() {
        return false;
    }

    public static void main(String[] args) throws Exception {
        TestClass tc = new TestClass();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}
