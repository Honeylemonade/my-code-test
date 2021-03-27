package 剑指offer.Q5_替换空格;

/**
 * ReplaceBlank:
 *
 * @author XvYanPeng
 * @date 2019/8/30 12:27
 */
public class ReplaceBlank {
    public static String replaceBlank(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Character character : string.toCharArray()) {
            if (character.toString().contentEquals(" ")) {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(character);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceBlank("hello world "));
    }
}
