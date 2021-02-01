import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonApp {
    public static void main(String[] args) throws IOException {
        //String month = "June";
        Seasons4 season = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your favorite season?");
        String month = br.readLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Seasons4.WINTER;
                System.out.println("My favorite season is:" + season);
                break;
            case "March":
            case "April":
            case "May":
                season = Seasons4.SPRING;
                System.out.println("My favorite season is:" + season);
                break;
            case "June":
            case "July":
            case "August":
                season = Seasons4.SUMMER;
                System.out.println("My favorite season is:" + season);
                break;
            case "September":
            case "October":
            case "November":
                season = Seasons4.AUTUMN;
                System.out.println("My favorite season is:" + season);
                break;
            default:
                System.out.println("Something's come up...");
        }
    }
}


