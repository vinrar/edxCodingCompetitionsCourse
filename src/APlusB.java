import java.io.*;
import java.net.URL;

public class APlusB {

    public static void main(String[] args) throws IOException {
        URL path = APlusB.class.getResource("input.txt");
        File file = new File(path.getFile());
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String[] strARr = line.split(",");
            int out = 0;
            out += Integer.parseInt(strARr[0]);
            out += Math.pow(Integer.parseInt(strARr[1]), 2);
            sb.append(out);
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
            bw.close();
        }
    }
}
