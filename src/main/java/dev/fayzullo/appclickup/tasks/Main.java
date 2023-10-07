package dev.fayzullo.appclickup.tasks;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        HashMap<String, String> didNotWords = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int count = 0;


        String[] words_english = {
                "beak","damp","disapprove",
                "except","flight","fond","immoral","ivy","moan","oblivious","perish","pit","rim","roost",
                "slippery","soar","trivial","typical","utterly","weep","awhile","cyberspace","edit","essay",
                "evaluate","faint","global","gymnasium","highlight","ignorant","index",
                "lecture","moral","operate","private","recent","resolution","semester",
                "typewritten","weird"
        };

        String[] words_uzb = {"tumshuq",
                "nam","norozi bo'lmoq","...dan tashqari","reys","ishqiboz","axloqsiz","pechak",
                "ingramoq","unutgan","o'lmoq","o'ra","to'g'in","qo'noq","sirpanchiq",
                "baland uchmoq","arzimas","odatiy","butkul","yig'lamoq","biroz vaqtga",
                "kiber bo'shliq","tahrirlamoq","insho","o'rganib chiqmoq",
                "xushidan ketmoq","global","gimnastika zali","marker bilan belgilamoq","bexabar",
                "ilova","ma'ruza","xulosa","ishlamoq","shahsiy1","yaqinda sodir bo'lgan","qa'tiy qaror",
                "semestr","kompyuterda yozilgan","g'ayritabiiy"
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
