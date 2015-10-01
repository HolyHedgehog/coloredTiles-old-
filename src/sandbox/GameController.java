/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.util.Random;

/**
 *
 * @author Hedgehog
 */
public class GameController {

    private final int[][] CellsColors = new int[40][40];
    private final int[][] CellsPlayer = new int[40][40];
    private static int currentDif = Settings.MIN_FIELD_SIZE;

    public GameController() {
        Random rand = new Random();
        for (int i = 0; i < currentDif; i++) {
            for (int j = 0; j < currentDif; j++) {
                CellsColors[i][j] = rand.nextInt(6);
                CellsPlayer[i][j] = 0;
            }
        }
        if (CellsColors[0][0] == CellsColors[currentDif - 1][currentDif - 1]) {
            CellsColors[currentDif - 1][currentDif - 1] = 1;
            CellsColors[0][0] = 2;
        }

        CellsPlayer[0][0] = 1;
        CellsPlayer[currentDif - 1][currentDif - 1] = 2;
        this.Move(CellsColors[0][0]);
        this.MoveComp(CellsColors[currentDif - 1][currentDif - 1]);
    }

    public int[][] getCellsColors() {
        return CellsColors;
    }

    public int[] getGameStatus() {
        int[] result = new int[3];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < currentDif; i++) {
            for (int j = 0; j < currentDif; j++) {
                switch (CellsPlayer[i][j]) {
                    case 0: {
                        c++;
                        break;
                    }
                    case 1: {
                        a++;
                        break;
                    }
                    case 2: {
                        b++;
                        break;
                    }
                    default: {
                        System.out.println("этого быть недолжно. метод геймстатус. проверяй балбес");
                    }
                }
            }
            result[0] = a;
            result[1] = b;
            result[2] = c;
        }
        return result;
    }

    public void Move(int a) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < currentDif; i++) {
                for (int j = 0; j < currentDif; j++) {
                    if (CellsPlayer[i][j] == 1) {
                        CellsColors[i][j] = a;

                        if ((j < currentDif - 1) && (CellsPlayer[i][j + 1] == 0) && (CellsColors[i][j + 1] == a)) {
                            CellsPlayer[i][j + 1] = 1;
                            flag = true;
                        }
                        if ((i < currentDif - 1) && (CellsPlayer[i + 1][j] == 0) && (CellsColors[i + 1][j] == a)) {
                            CellsPlayer[i + 1][j] = 1;
                            flag = true;
                        }
                        if ((i > 0) && (CellsPlayer[i - 1][j] == 0) && (CellsColors[i - 1][j] == a)) {
                            CellsPlayer[i - 1][j] = 1;
                            flag = true;
                        }
                        if ((j > 0) && (CellsPlayer[i][j - 1] == 0) && (CellsColors[i][j - 1] == a)) {
                            CellsPlayer[i][j - 1] = 1;
                            flag = true;
                        }

                    }

                }

            }
        }

    }

    public void MoveComp() {
//        int a = genRandColor();
        int a = goodMove();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = currentDif - 1; i != -1; i--) {
                for (int j = currentDif - 1; j != -1; j--) {
                    if (CellsPlayer[i][j] == 2) {
                        CellsColors[i][j] = a;

                        if ((j < currentDif - 1) && (CellsPlayer[i][j + 1] == 0) && (CellsColors[i][j + 1] == a)) {
                            CellsPlayer[i][j + 1] = 2;
                            flag = true;
                        }
                        if ((i < currentDif - 1) && (CellsPlayer[i + 1][j] == 0) && (CellsColors[i + 1][j] == a)) {
                            CellsPlayer[i + 1][j] = 2;
                            flag = true;
                        }
                        if ((i > 0) && (CellsPlayer[i - 1][j] == 0) && (CellsColors[i - 1][j] == a)) {
                            CellsPlayer[i - 1][j] = 2;
                            flag = true;
                        }
                        if ((j > 0) && (CellsPlayer[i][j - 1] == 0) && (CellsColors[i][j - 1] == a)) {
                            CellsPlayer[i][j - 1] = 2;
                            flag = true;
                        }

                    }

                }

            }
        }

    }

    private void MoveComp(int a) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = currentDif - 1; i != -1; i--) {
                for (int j = currentDif - 1; j != -1; j--) {
                    if (CellsPlayer[i][j] == 2) {
                        CellsColors[i][j] = a;

                        if ((j < currentDif - 1) && (CellsPlayer[i][j + 1] == 0) && (CellsColors[i][j + 1] == a)) {
                            CellsPlayer[i][j + 1] = 2;
                            flag = true;
                        }
                        if ((i < currentDif - 1) && (CellsPlayer[i + 1][j] == 0) && (CellsColors[i + 1][j] == a)) {
                            CellsPlayer[i + 1][j] = 2;
                            flag = true;
                        }
                        if ((i > 0) && (CellsPlayer[i - 1][j] == 0) && (CellsColors[i - 1][j] == a)) {
                            CellsPlayer[i - 1][j] = 2;
                            flag = true;
                        }
                        if ((j > 0) && (CellsPlayer[i][j - 1] == 0) && (CellsColors[i][j - 1] == a)) {
                            CellsPlayer[i][j - 1] = 2;
                            flag = true;
                        }

                    }

                }

            }
        }

    }

    public int goodMove() {

        int[] Count_colors_cells = new int[6];

        int[][] buffCellsColors = new int[40][40];
        int[][] buffCellsPlayer = new int[40][40];

        for (int k = 0; k < 6; k++) {

            Count_colors_cells[k] = 0;

            for (int i = 0; i < currentDif; i++) {                                      //Натерпелся с этим место. Изначально было так
                for (int j = 0; j < currentDif; j++) {                                  //buffCellsColors=getCellsColors();
                    buffCellsColors[i][j] = CellsColors[i][j];                  //Долго думал почему CellsColors меняется.
                    buffCellsPlayer[i][j] = CellsPlayer[i][j];                  //СОздавалась не копия а ссылка. так что теперь вот так.
                }

            }

            if ((buffCellsColors[0][0] != k) && (buffCellsColors[currentDif - 1][currentDif - 1] != k)) {

                boolean flag = true;
                while (flag) {
                    flag = false;
                    for (int i = currentDif - 1; i != -1; i--) {
                        for (int j = currentDif - 1; j != -1; j--) {
                            if (buffCellsPlayer[i][j] == 2) {
                                buffCellsColors[i][j] = k;

                                if ((j < currentDif - 1) && (buffCellsPlayer[i][j + 1] == 0) && (buffCellsColors[i][j + 1] == k)) {
                                    buffCellsPlayer[i][j + 1] = 2;
                                    Count_colors_cells[k]++;
                                    flag = true;
                                }
                                if ((i < currentDif - 1) && (buffCellsPlayer[i + 1][j] == 0) && (buffCellsColors[i + 1][j] == k)) {
                                    buffCellsPlayer[i + 1][j] = 2;
                                    Count_colors_cells[k]++;
                                    flag = true;
                                }
                                if ((i > 0) && (buffCellsPlayer[i - 1][j] == 0) && (buffCellsColors[i - 1][j] == k)) {
                                    buffCellsPlayer[i - 1][j] = 2;
                                    Count_colors_cells[k]++;
                                    flag = true;
                                }
                                if ((j > 0) && (buffCellsPlayer[i][j - 1] == 0) && (buffCellsColors[i][j - 1] == k)) {
                                    buffCellsPlayer[i][j - 1] = 2;
                                    Count_colors_cells[k]++;
                                    flag = true;
                                }

                            }

                        }

                    }
                }
            }
        }
        /*Это кусок использовался для отслеживания правильности работы метода*/
//        System.out.println("\n" + "ATENTION");
//        for (int i = 0; i < 6; i++) {
//            System.out.print("   " + Count_colors_cells[i]);
//        }
        int max_val = Integer.MIN_VALUE, index_val = 0,sum=0;
        for (int i = 0; i < 6; i++) {
            sum=sum+Count_colors_cells[i];
            if (Count_colors_cells[i] > max_val) {
                max_val = Count_colors_cells[i];
                index_val = i;
            }
        }
        if (sum==0){index_val=genRandColor();}
//        System.out.println("returned int - "+index_val);
        return index_val;
    }

    private int genRandColor() {
        Random rand = new Random();
        int result = rand.nextInt(6);
        while ((result == CellsColors[0][0]) || (result == CellsColors[currentDif - 1][currentDif - 1])) {
            result = rand.nextInt(6);
        }
        return result;

    }

    public static int getCurrentDif() {
        return currentDif;
    }

    public static void setCurrentDif(int currentDif) {
        GameController.currentDif = currentDif;
    }

    public void dispose() {
        for (int i = 0; i < currentDif; i++) {
            for (int j = 0; j < currentDif; j++) {
                CellsColors[i][j] = 0;
                CellsPlayer[i][j] = 0;

            }
        }

    }

}
