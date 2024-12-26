public class Task11 {
    public static int[] getFlawless(int[][] results) {
        int n = results.length;
        boolean[] flawless = new boolean[n];
        int flawlessCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isFlawless = true;
            for (int j = 0; j < n; j++) {
                if (i != j && results[i][j] == 0) {
                    isFlawless = false;
                    break;
                }
            }
            if (isFlawless) {
                flawless[i] = true;
                flawlessCount++;
            }
        }

        int[] flawlessTeams = new int[flawlessCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (flawless[i]) {
                flawlessTeams[index++] = i + 1;
            }
        }

        return flawlessTeams;
    }
    public static void main(String[]args){
        int[][] results = {
                {0, 2, 2, 1},
                {0, 0, 1, 2},
                {0, 1, 0, 0},
                {1, 0, 2, 0}
        };


        int[] flawlessTeams = getFlawless(results);


        System.out.println("Команди без поразок:");
        for (int teamNumber : flawlessTeams) {
            System.out.println("Команда " + teamNumber);
        }

    }
}
