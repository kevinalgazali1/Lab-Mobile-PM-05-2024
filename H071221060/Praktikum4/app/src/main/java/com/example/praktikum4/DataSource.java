package com.example.praktikum4;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Cat> cats = generateDummyCats();

    private static ArrayList<Cat> generateDummyCats() {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Rum Tum Tugger", "Rum", "Kebohongan itu seperti kucing: Kamu harus menghentikannya sebelum ia keluar atau sangat sulit ditangkap. - Charles M. Blow",
                R.drawable.cat1, R.drawable.cat1));
        cats.add(new Cat("Mad Catter", "Catter", "Kucing tampaknya berprinsip bahwa tidak ada salahnya meminta apa yang mereka inginkan. - Joseph Wood Krutch",
                R.drawable.cat2, R.drawable.cat2));
        cats.add(new Cat("Skimbleshanks", "Skim", "Kamu tidak dapat memiliki kucing. Hal terbaik yang dapat kamu lakukan adalah menjadi teman mereka. - Sir Harry Swanson",
                R.drawable.cat3, R.drawable.cat3));
        cats.add(new Cat("Black Panther", "Panther", "Jika ada suara universal yang menggambarkan perdamaian, saya pasti akan memilih untuk mendengkur seperti kucing. - Barbara L. Diamond",
                R.drawable.cat4, R.drawable.cat4));
        cats.add(new Cat("Edgar Allan Paw", "Edgar", "Kamu akan selalu beruntung jika tahu cara berteman dengan kucing.",
                R.drawable.catprof, R.drawable.catprof));
        cats.add(new Cat("Paw Paw", "Paw", "Karena kita masing-masing diberkati dengan hanya satu kehidupan, mengapa tidak menjalaninya dengan kucing? - Robert Stearns",
                R.drawable.cat6, R.drawable.cat6));
        return cats;
    }

}
