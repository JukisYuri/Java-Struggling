package GK;

public class Cau4De2 {
    public static String encodeString(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                int reverseshift = 2;
                if(c >= 'a' && c <= 'z'){
                    chars[i] = (char) (c - 'a' - (reverseshift % 26) + 'a');
                } else if(c >= 'A' && i <= 'Z'){
                    chars[i] = (char) (c - 'A' - (reverseshift % 26) + 'A');
                } else if(c >= '0' && i <= '9'){
                    chars[i] = (char) (c - '0' - (reverseshift % 10) + '0');
                }
            }
        }
        return new String(chars);
    }
    public static void main(String[] arg){
        String s = new String("gN4t");
        System.out.println("Kết quả trả ra là: " + encodeString(s));
    }
}
