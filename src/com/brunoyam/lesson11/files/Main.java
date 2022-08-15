package com.brunoyam.lesson11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/com/brunoyam/lesson11/files/hello.txt");
        try (Scanner scanner = new Scanner(file)) {
//            Scanner scanner = new Scanner(file);

            // Чтение из файла
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

//            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }

        // Еще один способ чтения из файла
        Path path = Paths.get("src/com/brunoyam/lesson11/files/hello.txt");
        try {
            String content = new String(Files.readAllBytes(path));
            System.out.println(content);

            content = "New content";
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}
