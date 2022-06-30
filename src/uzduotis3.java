public class uzduotis3 {
    public static void main(String[] args) {

        double[] masyvas = {2, 4, 6, 9, 12, 17};

        System.out.println("masyvo suma = " + (masyvoSuma(masyvas)));
    }

    public static double masyvoSuma(double[] masyvas){
        double suma = 0;
        int i = 0;
        while (i < masyvas.length){
            suma += masyvas[i];
            i++;
        }
        return suma;
    }
}
