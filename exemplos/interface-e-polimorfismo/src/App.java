public class App {
    public static void barulhos(Sons[] sons) {
        for (Sons s : sons) {
            System.out.println(s.som());            
        }
    }
    
    public static void main(String[] args) throws Exception {
        Sons[] sons = new Sons[3];

        sons[0] = new Vaca();
        sons[1] = new Galhinha();
        sons[2] = new Ovelha();

        barulhos(sons);
    }
}
