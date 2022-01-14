import java.io.*;

public class TwoTack {
    public static void main(String[] args) {
        int numberOffer = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("TextHome2.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("TextHome21.txt"))) {
            String line = "";
            String totalLine = "";
            while ((line = bufferedReader.readLine()) != null) {
                totalLine += line;
            }
            String[] arrayOffer = totalLine.split("\\.");
            for (int i = 0; i <arrayOffer.length; i++){
                numberOffer = TextFormater.numberOffer(arrayOffer[i]);
                if (numberOffer >=3 && numberOffer <=5 || (TextFormater.checkPolindrom(arrayOffer[i]))) {
                    writer.write(arrayOffer[i] + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//2)Текстовый файл содержит текст. После запуска программы в другой файл должны записаться только те предложения
// в которых от 3-х до 5-ти слов. Если в предложении присутствует слово-палиндром, то не имеет значения
// какое кол-во слов в предложении, оно попадает в новый файл.
//Пишем все в ООП стиле. Создаём класс TextFormater
// в котором два статических метода:
// 1. Метод принимает строку и возвращает кол-во слов в строке.
// 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
// В main считываем файл. Разбиваем текст на предложения. Используя методы класса TextFormater определяем подходит
// ли нам предложение. Если подходит добавляем его в новый файл

