package com.parubovdaniil_astontasks.HomeWork3;


import java.io.*;

public class FileHandler {
    private String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public void writeData(String data) throws FileWriteException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            throw new FileWriteException("Ошибка при записи в файл", e);
        }
    }

    public String readData() throws FileReadException {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new FileReadException("Ошибка при чтении из файла", e);
        }
        return data.toString();
    }
}

