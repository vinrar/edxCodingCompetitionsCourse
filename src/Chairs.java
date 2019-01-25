import mooc.EdxIO;

public class Chairs {
    public static void main(String[] args) {
        try(EdxIO io = EdxIO.create()){
            int a = io.nextInt();
            int b = io.nextInt();
            int c = io.nextInt();

            io.println(((a + b + c) * 1.0) / 6.0);
        }
    }
}
