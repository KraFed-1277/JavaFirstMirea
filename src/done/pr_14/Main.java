package done.pr_14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {

    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }


    public static void main(String[] args) {

        System.out.println("Введите строку, которую нужно разбить");
        Scanner sc = new Scanner(System.in);
        String toParse = sc.next();
        System.out.println("Введите строку, по которой нужно разбить строку '" + toParse + "'");
        String splitPhrase = sc.next();
        StringTokenizer st = new StringTokenizer(toParse, splitPhrase);
        System.out.println("Компоненты строки '" + toParse + "', разбтитые по строке '" + splitPhrase + "':");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }

        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("asdzfghd4yt5y5"));
        System.out.println();

        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
        System.out.println();



    }

}