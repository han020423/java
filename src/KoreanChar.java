public class KoreanChar {
    public static void main(String[] args) {
        char ch = '가';
        char prevKor = (char)((ch - 0xAC00) / (21 * 28));
        do {
            char nowKor = (char)((ch - 0xAC00) / (21 * 28));
            if (nowKor != prevKor) {
                System.out.println("\n--..--");
                prevKor = nowKor;           
            }
            System.out.print(ch);
            ch++;
        } while (ch <= '힣');
    }
}
