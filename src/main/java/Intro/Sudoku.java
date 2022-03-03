package Intro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sudoku {

    boolean solution(int[][] sudoku) {
        List<HashSet<Integer>> vertSud = new ArrayList<>();
        List<HashSet<Integer>> sudGrid = new ArrayList<>();

        for (int g = 0; g < 9; g++) {
            sudGrid.add(new HashSet<>());
        }

        for (int v = 0; v < 9; v++) {
            vertSud.add(new HashSet<>());
        }

        for (int i = 0; i < sudoku.length; i++) {
            int[] thisSud = sudoku[i];
            HashSet<Integer> horiSud = new HashSet<>();
            for (int j = 0; j < thisSud.length; j++) {
                int thisSpecificNumber = thisSud[j];
                int firstGridLtr = gridLtrHelper(i);
                int secondGridLtr = gridLtrHelper(j);
                String gridLtr = String.format("%d%d", firstGridLtr, secondGridLtr);
                switch (Integer.parseInt(gridLtr)) {
                    case 00 : {
                        if (sudGrid.get(0).contains(thisSud[j])) return false;
                        sudGrid.get(0).add(thisSud[j]);
                        break;
                    }
                    case 01 : {
                        if (sudGrid.get(1).contains(thisSud[j])) return false;
                        sudGrid.get(1).add(thisSud[j]);
                        break;
                    }
                    case 02 : {
                        if (sudGrid.get(2).contains(thisSud[j])) return false;
                        sudGrid.get(2).add(thisSud[j]);
                        break;
                    }

                    case 10 : {
                        if (sudGrid.get(3).contains(thisSud[j])) return false;
                        sudGrid.get(3).add(thisSud[j]);
                        break;
                    }
                    case 11 : {
                        if (sudGrid.get(4).contains(thisSud[j])) return false;
                        sudGrid.get(4).add(thisSud[j]);
                        break;
                    }
                    case 12 : {
                        if (sudGrid.get(5).contains(thisSud[j])) return false;
                        sudGrid.get(5).add(thisSud[j]);
                        break;
                    }

                    case 20 : {
                        if (sudGrid.get(6).contains(thisSud[j])) return false;
                        sudGrid.get(6).add(thisSud[j]);
                        break;
                    }
                    case 21 : {
                        if (sudGrid.get(7).contains(thisSud[j])) return false;
                        sudGrid.get(7).add(thisSud[j]);
                        break;
                    }
                    case 22 : {
                        if (sudGrid.get(8).contains(thisSud[j])) return false;
                        sudGrid.get(8).add(thisSud[j]);
                        break;
                    }

                }
                if (horiSud.contains(thisSpecificNumber) || horiSud.contains(0) || vertSud.get(j).contains(thisSpecificNumber) || vertSud.get(j).contains(0)) { // if the row contains the value already in the row OR column...
                    return false;
                } else {
                    horiSud.add(thisSpecificNumber);
                    vertSud.get(j).add(thisSpecificNumber);
                }
            }
        }
        return true;
    }

    public static int gridLtrHelper(int figureThis) {
        if (figureThis < 3) return 0;
        if (figureThis > 2 && figureThis < 6) return  1;
        if (figureThis > 5) return  2;
        return -1;
    }

}
