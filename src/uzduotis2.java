import java.util.Arrays;

public class uzduotis2 {
    public static void main(String[] args) {

        int[] x = {3, 5, 8};
        int[] y = {2, 7, 12, 9};

        System.out.println(Arrays.toString(sujungtiMasyvus(x, y)));


    }
    public static int[] sujungtiMasyvus(int[] x, int[] y){                                  //po int reikia [], nes kitaip nereturnins masyvo
        int[] z = new int[x.length + y.length];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            z[j] = x[i];
            j++;
        }
        for (int i = 0; i < y.length; i++) {
            z[j] = y[i];                                // arba z[j++]
            j++;
        }
        return z;
    }
}
