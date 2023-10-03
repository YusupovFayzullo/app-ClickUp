package dev.fayzullo.appclickup.tasks;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;


        String[] words_english = {"aroma", "beverage", "cluster", "combine", "contemporary",
                "cultivate", "condensed", "divine", "humid", "odor", "palate", "paradise", "plantation",
                "rapid", "rate", "soothing", "subtle", "texture", "toxic", "vary"};
        String[] words_uzb = {"xushbo'y hid", "ichimlik", "shingil", "birlashtirmoq", "zamonaviy",
                "o'stirmoq", "quyuq", "ilohiy", "nam", "hid", "tanglay",
                "jannatmakon joy", "plantatsiya", "tez", "tezlik", "tinchlantiruvchi",
                "ko'z ilg'amas", "tekstura", "zaharli", "farq qilmoqq"};

        List<Integer> randoms = randoms(words_english);


        for (int j = 0; j < randoms.size(); j++) {
            System.out.print("Enter uzbek of " + words_english[randoms.get(j)] + ":  ");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(words_uzb[randoms.get(j)])) {
                System.out.println("you are right");
                count++;
            } else System.out.println("you didn't know");
        }

        System.out.println("Your result " + count + "/" + words_english.length);


    }

    public static boolean existed(int i, List<Integer> exist) {
        if (exist.contains(i)) return true;
        return false;
    }

    private static List<Integer> randoms(String[] words) {

        List<Integer> exist = new ArrayList<>();

        while (exist.size() != words.length) {
            int j = new Random().nextInt(0, words.length);
            if (!existed(j, exist)) {
                exist.add(j);
            }
        }
        return exist;

    }
}
