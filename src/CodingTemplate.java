import mooc.EdxIO;

import java.util.HashMap;
import java.util.Map;

public class CodingTemplate {
    public static void main(String[] args) {
        try(EdxIO io = EdxIO.create()) {
            int n = io.nextInt();
            int m = io.nextInt();
            Map<Character, Point> map = new HashMap<>();

            for(int j = m; j > 0; j--){
                for(int i = 1; i <= n; i++){
                    Point p = new Point(i, j);
                    Character c = io.nextChar();
                    map.put(c , p);
                }
            }

            String lang = io.next();
            String outputLang = lang;
            int size = Integer.MAX_VALUE;

            while(lang != null) {
                String nextLine = io.next();
                if(nextLine.equalsIgnoreCase("%TEMPLATE-START%")) {
                    nextLine = io.next();
                    int dist = 0;
                    while(!nextLine.equalsIgnoreCase("%TEMPLATE-END%")) {
                        char[] arr = nextLine.toCharArray();
                        Point prevPoint = map.get(arr[0]);
                        Point currPoint = null;
                        for(int i = 1; i < arr.length; i++) {
                            currPoint = map.get(arr[i]);
                            dist += Math.max(Math.abs(prevPoint.x - currPoint.x), Math.abs(prevPoint.y - currPoint.y));
                            prevPoint = currPoint;
                        }
                        nextLine = io.next();
                    }

                    if(dist < size) {
                        outputLang = lang;
                        size = dist;
                    }
                }
                lang = io.next();
            }

            io.println(outputLang);
            io.println(size);
        }
    }

    public static class Point {
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int x;
        int y;
    }
}