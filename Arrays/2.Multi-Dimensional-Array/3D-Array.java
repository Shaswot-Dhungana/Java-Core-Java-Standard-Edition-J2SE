class Main {
    public static void main(String[] args) {

        // Array Declaration , creation and initiaization in one line.

        int[][][] TDArray = { { { 10, 20 }, { 30, 40, 50 }, { 60, 70, 80, 90 } } };

        // retriving data of array using loop.

        for (int i = 0; i < TDArray.length; i++) {
            for (int j = 0; j < TDArray[i].length; j++) {
                for (int k = 0; k < TDArray[i][j].length; k++) {
                    System.out.println(TDArray[i][j][k]);

                }
                System.out.println("    ");
            }

        }

    }
}