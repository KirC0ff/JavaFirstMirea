package ru.mirea.task27.opt1;

import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Амельянович", "Никита");
        dictionary.put("Белов", "Дмитрий");
        dictionary.put("Бокач", "Тимофей");
        dictionary.put("Брюхачев", "Алексей");
        dictionary.put("Васин", "Станислав");
        dictionary.put("Гольнева", "Алина");
        dictionary.put("Гудков", "Иван");
        dictionary.put("Двуреченский", "Захар");
        dictionary.put("Манохин", "Дмитрий");
        dictionary.put("Ермишин", "Максим");

        Collection<String> list = dictionary.values();
        for(Iterator<String> iter = list.iterator(); iter.hasNext();)
        {
            if(Collections.frequency(list, iter.next())>1)
            {
                iter.remove();
            }
        }

        System.out.printf("Словарь: %s%n", dictionary);
    }
}
