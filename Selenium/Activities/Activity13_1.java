package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {
    public static void main (String[] args) throws IOException, CsvException {
        CSVReader read = new CSVReader(new FileReader("src/test/java/Selenium_Files/Test.csv"));
        List<String[]> list1 = read.readAll();
        System.out.println("Total rows are : " + list1.size());

        Iterator<String[]> itr1 = list1.iterator();

        while(itr1.hasNext()){
            String[] str1 = itr1.next();
            System.out.println("Values are: ");
            for(int i=0; i<str1.length; i++){
                System.out.println("" + str1[i]);
            }
            System.out.println(" ");
        }
        read.close();



    }
}
