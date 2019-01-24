import mooc.EdxIO;

public class PrepYourselfForCompetitions {
    public static void main(String[] args) {
        try(EdxIO io = EdxIO.create()){
            int n = io.nextInt();
            int[] p = new int[n];
            int sum = 0;

            for(int i = 0; i < n; i++) {
                p[i] = io.nextInt();
            }

            boolean pchoosen = false;
            boolean tchoosen = false;

            for(int i = 0; i < n; i++) {
                int input = io.nextInt();
                if(p[i] > input){
                    pchoosen = true;
                    sum+=p[i];
                } else {
                    sum += input;
                    tchoosen = true;
                }
                p[i] -= input;
            }

            if(pchoosen && tchoosen) {
                io.println(sum);
                return;
            } else {
                if(tchoosen) {
                    int minDiff = Integer.MIN_VALUE;
                    for(int i = 0; i < n; i++) {
                        if(p[i] > minDiff){
                            minDiff = p[i];
                        }
                    }
                    sum += minDiff;
                } else if(pchoosen) {
                    int minDiff = Integer.MAX_VALUE;
                    for(int i = 0; i < n; i++) {
                        if(p[i] < minDiff){
                            minDiff = p[i];
                        }
                    }
                    sum -= minDiff;
                }
            }
            io.println(sum);
        }
    }
}