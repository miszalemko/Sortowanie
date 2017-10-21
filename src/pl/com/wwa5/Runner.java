package pl.com.wwa5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

    Man m0 = new Man("Grugor Yuri 35");
    Man m1 = new Man("Arugor Yuri 35");
    Man m2 = new Man("Arugor Yuri 45");
    Man m3 = new Man("Arugor Yuri 25");
    Man m4 = new Man("Grugor Yuri 35");
    Man m5 = new Man("Crugor Yuri 35");
    Man m6 = new Man("Grugor Yuri 35");
    Man m7 = new Man("Grugor Yuri 35");
    Man m8 = new Man("Grugor Yuri 35");
    Man m9 = new Man("Grugor Yuri 35");
    m0.seperatingNamesToFractionalParts();
    m1.seperatingNamesToFractionalParts();
    m2.seperatingNamesToFractionalParts();
    m3.seperatingNamesToFractionalParts();
    m4.seperatingNamesToFractionalParts();
    m5.seperatingNamesToFractionalParts();
    m6.seperatingNamesToFractionalParts();
    m7.seperatingNamesToFractionalParts();
    m8.seperatingNamesToFractionalParts();
    m9.seperatingNamesToFractionalParts();
    List<Man> people = new ArrayList<Man>();
    people.add(m0);
    people.add(m1);
    people.add(m2);
    people.add(m3);
    people.add(m4);
    people.add(m5);
    people.add(m6);
    people.add(m7);
    people.add(m8);
    people.add(m9);

        Collections.sort(people);
        for (Man man : people) {
            System.out.println(man);
        }
    }
}
