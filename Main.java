/**
 * Created by Wojcik94 on 2017-03-16.
 */

/**
 * Klasa testowa
 */
public class Main {
    /**
     * metoda testowa
     * @param args Nieuzywane
     */
    public static void main(String[] args){
        Punkt pierwszy=new Punkt();
        Punkt drugi=new Punkt(15);
        printInfo(pierwszy);
        printInfo(drugi);

        pierwszy.setMass(20);
        printInfo(pierwszy);

        Punkt obiekt[]= new Punkt[5];

        for(int i=0; i<obiekt.length;i++){
            obiekt[i]=new Punkt(i*5);
        }

        for(int i=0; i<obiekt.length;i++){
            System.out.print("Opis: "+ obiekt[i]);
            System.out.println(", masa: " + obiekt[i].getMass() + ", gl moment: "+obiekt[i].getMoment()+", st moment(d="
                    + (5+i) +"):"+obiekt[i].getSteinerMoment(5+i));
        }
    }

    /**
     * Metoda wypisująca parametru punktu
     * @param pierwszy Nazwa obiektu którego parametry chcemy wypisać
     */
    private static void printInfo(Punkt pierwszy) {
        System.out.print("Opis: "+pierwszy);
        System.out.println(", masa: " + pierwszy.getMass() + ", gl moment: "+pierwszy.getMoment()+", st moment(d=5):"
                +pierwszy.getSteinerMoment(5));
    }
}