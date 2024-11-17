package JavaBasic.GK;

public class Cau4De1 {
    public static String encodeString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                int shift = 3;
                if(c >= 'a' && c <= 'z') {
                    chars[i] = (char) (c - 'a' + (shift % 26) + 'a');
                } else if(i >= 'A' && i <= 'Z'){
                    chars[i] = (char) (c - 'A' + (shift % 26) + 'A');
                } else if(i >= '0' && i <= '9'){
                    chars[i] = (char) (c - '0' + (shift % 10) + '0');
                }
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String s = new String("aB2t");
        System.out.println("Ket qua tra ra la: " + encodeString(s));
    }
}
