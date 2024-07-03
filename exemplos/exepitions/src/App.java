public class App {
    public static void main(String[] args) {
        a(100);
        System.out.println("Execultando Main");
    }
    
    public static void a(int i) {
        System.out.println("Execultando a(): " + i);
        b(i);
    }

    public static void b(int i) {
        System.out.println("Execultando b(): " + i);
    }
}
