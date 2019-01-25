import mooc.EdxIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DreamTeam {
    public static void main(String[] args) {
        try(EdxIO io = EdxIO.create()) {
            int n = io.nextInt();
            int totalTime = 300 * 60;
            boolean printed = false;
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int in = io.nextInt();
                list.add(in);
            }

            Collections.sort(list);
            for(int i = 0; i < n; i++) {
                totalTime -= list.get(i);
                if(totalTime >= 0)
                    count += 1;
                else
                    break;
            }

            io.println(count);
        }
    }
}
