public class App {
    public static void main(String[] args) throws Exception {
        a(100);
        System.out.println("Execultando Main()");
    }
    
    public static void a(int i) throws Exception {
        try {
            System.out.println("Execultando a(): " + i);
            b(i);
        } catch (Exception e) {
            System.out.println("Tratando: " + e.getMessage());
        }
    }

    public static void b(int i) throws Exception {
        System.out.println("Execultando b(): " + i);
        throw new Exception("Minha exeption");
    }
}
