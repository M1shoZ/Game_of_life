public class main {
    public static void main(String[] args) {
        //Field field = new Field();
        Status status = new Status(10);
        status.setCell(3, 3,true);
        status.setCell(3, 4,true);
        status.setCell(3, 5,true);

        for (int i = 0; i < 5; i++) {
            status.check();
            status.step();
            System.out.println();
        }

    }
}
