/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class F {
    public String getGreeting() {
        return "F " +  new D().getGreeting() + " " + new E().getGreeting();
    }

    public static void main(String[] args) {
        System.out.println(new F().getGreeting());
    }
}
