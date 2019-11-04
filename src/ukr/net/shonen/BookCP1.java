package ukr.net.shonen;

public class BookCP1 {
    public static void main(String[] args) {
        char[][] ar = new char[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    ar[i][j] = '*';
                } else if ((i == 1 || i == 2 || i == 3) && j == 3) {
                    ar[i][j] = '*';
                } else if ((i == 1 || i == 2 || i == 3) && j != 3) {
                    ar[i][j] = ' ';
                } else if (i == 4) {
                    ar[4][j] = '*';
                } else if (i == 5) {
                    ar[5][j] = ' ';
                } else if (i == 6) {
                    ar[6][j] = '*';
                }
            }
        }
        for (int k = 0; k < 7; k++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(ar[j][k]);
            }
            System.out.println();
        }
    }
}
