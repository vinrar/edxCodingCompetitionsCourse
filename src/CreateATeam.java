import mooc.EdxIO;

public class CreateATeam {
    public static void main(String[] args) {
        try(EdxIO io = EdxIO.create()){
            int[][] a = new int[3][3];
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    a[i][j] = io.nextInt();
                }
            }
            double sum = 0.0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(j != i){
                        for(int k = 0; k < 3; k++){
                            if(k != i && k != j){
                                double localSum = Math.pow(a[0][i], 2) + Math.pow(a[1][j], 2) + Math.pow(a[2][k], 2);
                                localSum = Math.sqrt(localSum);
                                if(localSum > sum){
                                    sum = localSum;
                                }
                            }
                        }
                    }
                }
            }

            io.println(sum);
        }
    }
}
