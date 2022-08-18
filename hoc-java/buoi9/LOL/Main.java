package LOL;

import java.util.ArrayList;
import java.util.List;
import java.text.Format;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 

public class Main {
    
    public static void main(String[] args) {
        
        List<Hero> team1 = new ArrayList<>();
        List<Hero> team2 = new ArrayList<>();
        
        // team 1

        Hero hero1T1 = new Hero("AAA", "Top");
        Hero hero2T1 = new Hero("BBB", "Mid");
        Hero hero3T1 = new Hero("CCC", "Sup");
        Hero hero4T1 = new Hero("DDD", "Jungle");
        Hero hero5T1 = new Hero("EE", "Ad");

        team1.add(hero1T1);
        team1.add(hero2T1);
        team1.add(hero3T1);
        team1.add(hero4T1);
        team1.add(hero5T1);

        System.out.println("Team 1: ");
        System.out.println(team1.toString());

        // team 2

        Hero hero1T2 = new Hero("A2", "Top");
        Hero hero2T2 = new Hero("B2B", "Mid");
        Hero hero3T2 = new Hero("CC2C", "Sup");
        Hero hero4T2 = new Hero("D2D", "Jungle");
        Hero hero5T2 = new Hero("E22", "Ad");

        team2.add(hero1T2);
        team2.add(hero2T2);
        team2.add(hero3T2);
        team2.add(hero4T2);
        team2.add(hero5T2);

        System.out.println("Team 2: ");
        System.out.println(team2.toString());

        LocalTime currentTime = LocalTime.now(); // Tạo đối tượng currentTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatted = currentTime.format(formatter);
        System.out.println("Thoi gian bat dau tran: " + formatted);
    }
}