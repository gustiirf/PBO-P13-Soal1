abstract class MakhlukHidup {
    public abstract void bernafas();
    public abstract void makan();
    public void berkembangBiak() {
        System.out.println("Makhluk hidup berkembang biak.");
    }
}

class Manusia extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Manusia bernafas menggunakan paru-paru.");
    }

    @Override
    public void makan() {
        System.out.println("Manusia makan makanan yang dimasak atau mentah.");
    }
}

class Hewan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Hewan bernafas menggunakan paru-paru atau insang.");
    }

    @Override
    public void makan() {
        System.out.println("Hewan makan tumbuhan atau daging.");
    }
}

class Tumbuhan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Tumbuhan bernafas melalui stomata.");
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan menghasilkan makanan melalui fotosintesis.");
    }
}

public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        System.out.println("Manusia:");
        manusia.bernafas();
        manusia.makan();
        manusia.berkembangBiak();

        System.out.println("\nHewan:");
        hewan.bernafas();
        hewan.makan();
        hewan.berkembangBiak();

        System.out.println("\nTumbuhan:");
        tumbuhan.bernafas();
        tumbuhan.makan();
        tumbuhan.berkembangBiak();
    }
}
