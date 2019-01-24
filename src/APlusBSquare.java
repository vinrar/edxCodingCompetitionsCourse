import mooc.EdxIO;

public class APlusBSquare {

    public static void main(String[] args) {
        try (EdxIO io = EdxIO.create()) {
            long a = io.nextInt();
            long b = io.nextInt();
            io.println(a + b * b);
        }
    }

}