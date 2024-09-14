import java.io.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            File files = new File(args[0]);
            String[] filesArray = files.list();
            for (String file : filesArray) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                int numLines = 0;
                String line;
                while ((line = br.readLine()) != null) {
                    numLines++;
                }
                System.out.print("The the number of lines in this " + file + " is " + numLines + "\n");

            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + args[0] + " could not be found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

