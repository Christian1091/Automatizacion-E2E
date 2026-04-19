package helpers;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadCSV {

    public String[] loadCSV() {

        String[] credentials = new String[5];
        try
        {
            CSVReader reader = new CSVReader(new FileReader("src/test/resources/data/data.csv"));
            List<String[]> lines = reader.readAll();

            if (lines.size() > 1) {
                credentials = lines.get(1);
            } else {
                System.out.println("El archivo CSV está vacio");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
        return credentials;
    }
}