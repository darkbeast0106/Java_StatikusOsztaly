package hu.petrik.statikusosztaly;

public class Main {
    private int simaAdattag = 0;
    private static int statikusAdattag = 0;


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velEgesz(10,50) + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velKarakter('a','z') + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velVezeteknev());
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velKeresztnev(true));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velKeresztnev(false));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velKeresztnev());
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(Veletlen.velTeljesnev());
        }
        System.out.println();

        /*
        //Ez nem kell:
	    Main valami = new Main();
	    //Ezt pedig nem is tudjuk megvalósítani:
	    //Math math = new Math();
        //this kulcsszó nem használható statikus kontextusban
        System.out.println(this.simaAdattag);
        System.out.println(this.statikusAdattag);
        System.out.println(valami.simaAdattag);
        System.out.println(valami.statikusAdattag);
        */
    }

    public void nemStatikusMetodus(){
        System.out.println(this.simaAdattag);
        //Statikus adattagot el lehet érni objektumpéldány változójaként, de ne használjuk így:
        System.out.println(this.statikusAdattag);
    }
}
