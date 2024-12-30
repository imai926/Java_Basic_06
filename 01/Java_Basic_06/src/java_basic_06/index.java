package java_basic_06;

public  class index{
    public static String reverseString(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        str = builder.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = args[0];
        String reverseStr = reverseString(str);

        System.out.println("元の文字列: " + str);
        System.out.println("逆順の文字列: " + reverseStr);
    }
}
