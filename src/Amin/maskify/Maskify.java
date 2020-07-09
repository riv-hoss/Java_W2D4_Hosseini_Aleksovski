package Amin.maskify;

public class Maskify {

    public static String maskify(String str) {

        String hashPart = "";

        if (str.length() < 4) {
            return str;

        } else {
            for (int i = 0; i < str.length() -4; i++) {
                hashPart += "#";
            }

        }
        String lastFourChar = str.substring(str.length() -4);
        return hashPart + lastFourChar;
    }


    public static void main(String[] args) {
        System.out.println(maskify("p988tyjoiijp79"));
    }
}
