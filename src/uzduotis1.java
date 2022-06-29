import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {

        /**Scanner skaitytuvas = new Scanner(System.in);

        System.out.println("Įveskite skaičių: ");
        int skaicius = skaitytuvas.nextInt();
        System.out.println("Įveskite skaičių: ");
        int skaicius1 = skaitytuvas.nextInt();
        System.out.println("Įveskite skaičių: ");
        int skaicius2 = skaitytuvas.nextInt();
        System.out.println("Įveskite skaičių: ");
        int skaicius3 = skaitytuvas.nextInt();
        arPirminis(skaicius);
        arPirminis(skaicius1);
        arPirminis(skaicius2);
        arPirminis(skaicius3);*/


        int[] masyvas = {2, 8, 13, 15, 17, 25, 22, 48, 49, 53, 55, 51, 50, 33, 77, 100, 88, 80, 81, 83};


        System.out.println("suMasyvu(masyvas) = " + suMasyvu(masyvas));
    }
    public static int suMasyvu(int[] masyvas){
        int suma = 0;
        for (int elementas: masyvas) {
            if (arPirminis(elementas)){
                suma += 1;
                }
        }
        return suma;
    }
    public static boolean arPirminis(int numberis){
        if (numberis <= 1) {
            System.out.println("Skaičius ne pirminis");
            return false;
        }
        else {
            for(int i = 2; i < numberis; i++){
                if(numberis % i == 0){
                    System.out.println("Skaičius ne pirminis");
                    return false;
                }
            }
            System.out.println("Sveikiname, skaičius pirminis");
            return true;
        }
    }
}