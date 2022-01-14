import java.io.*;
import java.util.ArrayList;

public class Home11 {
    public static void main(String[] args) {
        OneTack oneTack = new OneTack();
        oneTack.oneTack();
    }

}


//2)Текстовый файл содержит текст. После запуска программы в другой файл должны записаться только те предложения
// в которых от 3-х до 5-ти слов. Если в предложении присутствует слово-палиндром, то не имеет значения
// какое кол-во слов в предложении, оно попадает в новый файл.
//Пишем все в ООП стиле. Создаём класс TextFormater
// в котором два статических метода:
// 1. Метод принимает строку и возвращает кол-во слов в строке.
// 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
// В main считываем файл. Разбиваем текст на предложения. Используя методы класса TextFormater определяем подходит ли нам предложение. Если подходит добавляем его в новый файл

//3) Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла определите сами, хотите каждое слово
// на новой строке, хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
// Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного
// недопустимого слова, то выводите сообщение о том что текст прошёл проверку на цензуру.
// Если нет, то выводите соответствуюущее сообщение, кол-во предложений не прошедших проверку и сами
// предложения подлежащие исправлению.