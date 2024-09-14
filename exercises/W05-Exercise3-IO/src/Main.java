import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(args[0] + ".annotated"));
                PrintWriter pw = new PrintWriter(bw);
                ) {
            String line;
            while ((line = br.readLine()) != null) {
                int total = 0;
                total += line.length();
                pw.println(total + " characters in this line: " + line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


    }
}