package ru.mirea.task12.opt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestQuick {

    public static void main(String[] args) {
        List<Student> scoreList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student((int)(Math.random()*100));
            scoreList.add(student);
            System.out.println(student);
        }
        System.out.print("\nОтсортированный массив:\n");
        Comparator scoreComparator = new SortingStudentsByGPA();
        Collections.sort(scoreList, scoreComparator);
        System.out.println();
        for (Student student:scoreList) {
            System.out.println(student);
        }
    }
}