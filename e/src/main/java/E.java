/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class E {
    public String getGreeting() {
        return "E " + new A().getGreeting();
    }

    public static void main(String[] args) {
        System.out.println(new E().getGreeting());
    }
}