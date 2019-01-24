import mooc.EdxIO;

public class ThreeBonacci {
    public static void main(String[] args) {
        try(EdxIO in = EdxIO.create()) {
            int a0 = in.nextInt();
            int a1 = in.nextInt();
            int a2 = in.nextInt();

            int n = in.nextInt();

            in.println(findFib(n, a0, a1, a2));
        }
    }

    public static int findFib(int n, int a0, int a1, int a2){
        if(n == 0){
            return a0;
        } else if(n == 1){
            return a1;
        } else if(n == 2){
            return a2;
        }

        return findFib(n-1, a0, a1, a2) + findFib(n-2, a0, a1, a2) + findFib(n-3, a0, a1, a2);
    }
}
