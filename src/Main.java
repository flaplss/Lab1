import java.util.Random;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        long[] d = new long[15 - 5 + 1];
        for (int i = 0; i < d.length; i++) {
            d[i] = 5 + i;
        }
        float[] x = new float[10];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextFloat() * (10 + 5) - 5;
        }
        double[][] g = new double[11][10];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                switch ((int) d[i]) {
                    case 9 -> g[i][j] = pow(sin(pow(x[j], x[j] / 0.25)) / 2, 3);
                    case 5, 8, 10, 11, 13 -> g[i][j] = pow((0.25 / exp(pow(x[j], x[j] + 0.25))), 3);
                    default -> g[i][j] = pow(pow(2 * cos(exp(x[j])), 2), 3);
                }
            }
        }
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.printf("%10.5f ", g[i][j]);
            }
            System.out.println();
        }
    }

}



