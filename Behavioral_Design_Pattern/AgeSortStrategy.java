package edu.parinya.softarchdesign.behavioral2;

import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) { return o1.getAge() < o2.getAge() ? -1 : 1; }
        });

    }

}
