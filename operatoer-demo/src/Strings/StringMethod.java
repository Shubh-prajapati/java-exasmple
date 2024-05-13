package Strings;

public class StringMethod {
    public static void main(String[] args) {
        String s="Shubham";

        System.out.println(s.concat("Prajapati"));
        System.out.println(s.contains("Shubh"));
        System.out.println(s.replace("Shubham","Prajapati"));
        System.out.println(s.indexOf('u'));

        char[]ch=s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]);
        }

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println("shubh".trim());

    }
}
