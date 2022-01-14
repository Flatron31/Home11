import java.io.*;

public class OneTack {
    public void oneTack(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text1.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (checkPolindrom(line)) {
                    bufferedWriter.write(line + " ");
                } else {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private boolean checkPolindrom(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(line.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }


}
