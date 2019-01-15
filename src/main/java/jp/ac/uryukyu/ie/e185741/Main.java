package jp.ac.uryukyu.ie.e185741;

public class Main {
    public static void main(String args[]) {
        // 盤面状態
        int ban[][] = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,1,2,0,0},
                {0,0,2,1,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
        };
        // 盤面表示
        System.out.println("+--+--+--+--+--+--+");
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 6; j++) {
                if (ban[i][j] == 1) {
                    System.out.print("● |");
                } else if (ban[i][j] == 2) {
                    System.out.print("○ |");
                } else {
                    System.out.print("  |");
                }
            }
            System.out.println();
            System.out.println("+--+--+--+--+--+--+");
        }
    }
}
