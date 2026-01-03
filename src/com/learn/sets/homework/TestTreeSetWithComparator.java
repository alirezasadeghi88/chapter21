package com.learn.sets.homework;

import java.awt.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithComparator {
    public static void main(String[] args) {

        Set<Rectangle> set=
                new TreeSet<>((Comparator) new GeometricObjectComparator());
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element: set)
            System.out.println("area = " + element.getArea());
    }
}
