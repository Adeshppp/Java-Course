public class StringBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Adesh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Padwal");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
        sb.delete(2,4);
        System.out.println(sb);

    }
}
