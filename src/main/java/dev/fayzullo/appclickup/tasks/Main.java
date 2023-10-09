package dev.fayzullo.appclickup.tasks;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        HashMap<String, String> didNotWords = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int count = 0;


        String[] words_english = {
                "absolute","alas","attentive","cape","envision","evenly",
                "folk","melt","patch","pleasure","pop","pudding","rail",
                "recipe","role","shrink","soak","spark","spirit","suit"
        };

        String[] words_uzb = {
                "mutloq","afsus","diqqatli","yoping'ich","tasavvur qilmoq","bir xilda",
                "yaqinlar","erimoq","yamoq","mamnuniyat","paqillagan ovoz","shirin desert",
                "zinapoya panjarasi","retsept","vazifa","kichraymoq","ivitmoq","uchqun",
                "ruhiyat","kostyum"
        };

        List<Integer> randoms = randoms(words_english);


        for (int j = 0; j < randoms.size(); j++) {
            System.out.print("Enter uzbek of " + words_english[randoms.get(j)] + ":  ");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(words_uzb[randoms.get(j)])) {
                System.out.println("you are right");
                count++;
            } else {
                System.out.println("you didn't know");
                didNotWords.put(words_english[randoms.get(j)],words_uzb[randoms.get(j)]);
            }
        }

        System.out.println();
        System.out.println("Your result " + count + "/" + words_english.length);
        if(!didNotWords.isEmpty()){
            System.out.println();
            System.out.println("You did not this word/s: ");
            System.out.println(didNotWords);
        }


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
