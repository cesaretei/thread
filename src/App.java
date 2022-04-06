public class App {
    public static void main(String[] args) throws Exception {
        Salvadanaio s1= new Salvadanaio();

        Azione inserisciMoneta= new Azione(s1, true);
        inserisciMoneta.start();

        Azione prelevaMonete= new Azione(s1, false);
        prelevaMonete.start();
        System.out.println("i threads sono partiti");


        prelevaMonete.join();
        inserisciMoneta.join();
        System.out.println("il threads hanno finito");

        System.out.println(s1.monete);
    }
}
