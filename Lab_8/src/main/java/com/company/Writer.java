package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public final void writeToFile(final List<Performance> performanceList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\Кєк\\Програмування\\Java\\Lab7\\Levonoviy/list.csv"))) {

            performanceList.forEach((Performance performance) -> {
                writer.println(performance.getHeaders());
                writer.println(performance.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}