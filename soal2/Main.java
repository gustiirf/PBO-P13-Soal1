abstract class MakhlukHidup {
    protected int posisiX;
    protected int posisiY;

    public MakhlukHidup(int x, int y) {
        this.posisiX = x;
        this.posisiY = y;
    }

    abstract void bergerak();

    public void tampilkanPosisi() {
        System.out.println("Posisi: (" + posisiX + ", " + posisiY + ")");
    }

    public int getPosisiX() {
        return posisiX;
    }

    public int getPosisiY() {
        return posisiY;
    }
}

class Rabbit extends MakhlukHidup {
    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    void bergerak() {
        // Logika pergerakan Rabbit (contoh sederhana)
        posisiX += (Math.random() < 0.5) ? 1 : -1; // Bergerak ke kanan atau kiri
        posisiY += (Math.random() < 0.5) ? 1 : -1; // Bergerak ke atas atau bawah
        System.out.println("Rabbit bergerak.");
    }
}

class Fox extends MakhlukHidup {
    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    void bergerak() {
        // Logika pergerakan Fox (contoh sederhana)
        posisiX += (Math.random() < 0.5) ? 2 : -2; // Bergerak lebih jauh ke kanan atau kiri
        posisiY += (Math.random() < 0.5) ? 2 : -2; // Bergerak lebih jauh ke atas atau bawah
        System.out.println("Fox bergerak.");
    }
}

public class Main {
    private static final int GRID_SIZE = 10; 

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit(0, 0);
        Fox fox = new Fox(5, 5);


        System.out.println("Posisi awal:");
        tampilkanGrid(rabbit, fox);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nPergerakan ke-" + (i + 1) + ":");
            rabbit.bergerak();
            fox.bergerak();
            tampilkanGrid(rabbit, fox);
        }
    }

    private static void tampilkanGrid(Rabbit rabbit, Fox fox) {
        for (int y = 0; y < GRID_SIZE; y++) {
            for (int x = 0; x < GRID_SIZE; x++) {
                if (x == rabbit.getPosisiX() && y == rabbit.getPosisiY()) {
                    System.out.print("R "); // R untuk Rabbit
                } else if (x == fox.getPosisiX() && y == fox.getPosisiY()) {
                    System.out.print("F "); // F untuk Fox
                } else {
                    System.out.print(". "); // . untuk posisi kosong
                }
            }
            System.out.println();
        }
    }
}