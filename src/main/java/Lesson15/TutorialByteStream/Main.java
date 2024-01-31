package Lesson15.TutorialByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        /* InputStream - байтовый поток, конструкторы данных классов открывают поток и    -1 ... 255
        связывают его с данным файлом, в потопке Tread блокируется не более одного раза, не гарантирует чтение всего массива данных

        BufferedIputStream на будущее считывает байты, складывает во внутренний массив что б последующие разы вызова read отдавать байты по чутьчуть
        (Сделанно это для того, чтобы сэкономить ресурс, т.к. обычныый FileInputStream делает каждый раз заного запросы в систему)

        DataInputStream чтение двоичного формата файлов
        OutputStream писать байты
        Reader - читать символы
        Writer - писать символы
         */
        String path = "D:\\IntJava\\IT_Academy\\IT_AcademyLessonsAndHomeW\\src\\main\\java\\Lesson15\\TutorialByteStream\\1.txt";

        FileInputStream fis = null;
        int i = 0;
        try {
            fis = new FileInputStream(path); // байтовый поток
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) { // проверка необходима, т.к. в этом случае компилятор путь не проверяет
            throw new RuntimeException(e);
        } catch (IOException e) { // в случаях, если произойдет сбой во время чтения файла
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileOutputStream fileOutputStream = null;
        String str = "Hot";

        try {
            fileOutputStream = new FileOutputStream(path, true);
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.youtube.com/watch?v=801qM5vrYdc")).build();
//
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join(); читает код всей страницы https://www.youtube.com/watch?v=801qM5vrYdc
    }
}
