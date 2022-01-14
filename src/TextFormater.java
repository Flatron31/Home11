import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFormater {

    public static int numberOffer(String array){
        String[] arrayString = array.split(" ");
        return arrayString.length;
    }


    public static boolean checkPolindrom(String array) {

        String[] arrayString = array.trim().split(" ");
        StringBuilder stringBuilder;
        for (int i = 0; i < arrayString.length; i++) {
            stringBuilder = new StringBuilder(arrayString[i]);
            if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                return true;
            }
        }
        
        return false;
    }
}
