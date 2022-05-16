package com.animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 /*Circle деген класс тузунуз, анын PI деген свойствасы, area
жана circumference деген статик методдору болсун.
areaны табуу учун: PI * (radius * radius)
circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
*/

        Scanner sc = new Scanner(System.in);

        Circle.area(sc.nextInt());
        Circle.circumference(sc.nextInt());
    }
}
