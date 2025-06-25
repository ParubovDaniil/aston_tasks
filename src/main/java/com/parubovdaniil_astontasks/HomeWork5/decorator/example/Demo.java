package com.parubovdaniil_astontasks.HomeWork5.decorator.example;

import com.parubovdaniil_astontasks.HomeWork5.decorator.example.decorators.*;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("/mnt/hgfs/DataDirectory/VSSC/aston_tasks/src/main/java/com/parubovdaniil_astontasks/HomeWork5/decorator/example/DEC.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("/mnt/hgfs/DataDirectory/VSSC/aston_tasks/src/main/java/com/parubovdaniil_astontasks/HomeWork5/decorator/example/DEC.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
