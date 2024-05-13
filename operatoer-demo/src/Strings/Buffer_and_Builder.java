package Strings;

public class Buffer_and_Builder {
    public static void main(String[] args) {
        StringBuffer buffercity=new StringBuffer();
        buffercity.append("Mumbai");
        System.out.println("buffer city "+ buffercity);
        System.out.println("buffercity.capacity()" + buffercity.capacity());

        System.out.println("==================================================");

        StringBuilder buildercity=new StringBuilder();
        buildercity.append("Pune");
        System.out.println("builder city "+ buffercity);
        System.out.println("buildercity.capacity() "+ buildercity.capacity());
    }
}
