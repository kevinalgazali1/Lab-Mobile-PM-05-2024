package com.example.praktikum3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<University> universities = generateDummyUniversities();

    private static ArrayList<University> generateDummyUniversities() {
    ArrayList<University> universities = new ArrayList<>();
    universities.add(new University("Universitas Hasanuddin", "Unhasku bersatu, Unhasku kuat", R.drawable.unhas, R.drawable.unhas3, R.drawable.unhas2,5000000, 1));
    universities.add(new University("Universitas Pertanian Bogor", "Inspiring Innovation with Integrity", R.drawable.ipb, R.drawable.ipb2, R.drawable.ipb3, 4000000, 2));
    universities.add(new University("Universitas Teknologi Bandung", "In Harmonia Progressio", R.drawable.itb, R.drawable.itb2, R.drawable.itb3, 6000000, 3));
    universities.add(new University("Universitas Teknologi Sepuluh November", "ITS ADVANCING HUMANITY: Semangat baru untuk menciptakan inovasi melalui teknologi dan pengetahuan bagi masyarakat", R.drawable.its, R.drawable.its3, R.drawable.its2, 7000000, 4));
    universities.add(new University("Universitas Brawijaya", "Building Up Noble Future", R.drawable.ub, R.drawable.ub3, R.drawable.ub2, 10000000, 5));
    universities.add(new University("Universitas Indonesia", "Veritas, Probitas, Iustitia memiliki arti kejujuran, kebenaran, dan keadilan", R.drawable.ui, R.drawable.ui3, R.drawable.ui2, 500000, 6));
    universities.add(new University("Universitas Gajah Mada", "Mengakar Kuat dan Menjulang Tinggi", R.drawable.ugm, R.drawable.ugm2, R.drawable.ugm3, 3000000, 7));
    universities.add(new University("Universitas Sebelas Maret", "Berbudaya ACTIVE, Internasionalisasi, Sinergi, Akselerasi", R.drawable.uns, R.drawable.uns3, R.drawable.uns2, 2000000, 8));
    universities.add(new University("Universitas Airlangga", "Excellence with Morality", R.drawable.unair, R.drawable.unair3, R.drawable.unair2, 50045400, 9));
    universities.add(new University("Universitas Padjajaran", "Aku, Kamu, Kita, Salam Satu Unpad!", R.drawable.unpad, R.drawable.unpad2, R.drawable.unpad3, 5340000, 10));
    return universities;
    }
}
