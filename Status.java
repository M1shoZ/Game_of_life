public class Status {
    private boolean cell[][];
    private boolean cell2[][];

    int fsize;

    public Status(int fsize) {
        cell = new boolean[fsize][fsize];
        cell2 = new boolean[fsize][fsize];
        this.fsize = fsize;
        init();
    }

    public void setCell(int x, int y, boolean st) {
        this.cell[x][y] = st;
    }


    public void init() { //
        for (int i = 0; i < fsize; i++) {
            for (int j = 0; j < fsize; j++) {
                cell[i][j] = false;
            }
        }
    }

    public void step() {
        //boolean cell2[][] = cell;
        for (int i = 1; i < fsize - 1; i++) { //строка
            for (int j = 1; j < fsize - 1; j++) { //столбец
                int count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if ((cell[k][l] == true)&& ((k != i) || (l != j))) {
                        //if ((cell[k][l] == true)) {
                        //if (!(cell[k][l] == false)){
                            count++;
                        }
                    }
                }
                //System.out.println(count);
                if (count == 3)
                    cell2[i][j] = true;
                if ((count == 2) && (cell[i][j] == true))
                    cell2[i][j] = true;
                if ((count >= 4) || (count <= 1))
                    cell2[i][j] = false;
            }
        }
        cell = cell2;
    }


    public void check() {
        for (int i = 0; i < fsize; i++) { //строка
            System.out.print("\n");
            for (int j = 0; j < fsize; j++) {
                if (cell[i][j] == true) {
                    System.out.print("+ ");
                }
                else
                    System.out.print(". ");
            }
        }
    }
}


/*private int st = 1;

    public int step1(int around) {
        if (st == 1) {
            if (around == 3){
                return st = 2;
            }
            else{
                return st = 1;
            }
        }
        if (st == 3) {
            if (around <= 1 || around >= 4){
                return st = 4;
            }
            else{
                return st = 3;
            }
        }
        return st;
    }

    public int step2(int around) {
        if (st == 2)
            return st = 3;
        if (st == 4)
            return st = 1;
        return st;
    }

    public boolean isCell(){        // alive
        return st == 3 || st == 4;
    }

     */