package CodeTemplate;

public class StringBuilderTemplate {
    public static void main(String[] args) {
        String str = "test";
        StringBuilder strB = new StringBuilder(str);
        strB.append("1");
        str = str+ "2";

        for (int i=0; i< str.length(); i++){
            System.out.println(str.charAt(i));
        }

        strB.delete(strB.length()-1,strB.length());
        for (int i=0; i< strB.length(); i++){
            System.out.println(strB.charAt(i));
        }
        strB.replace(0,1,"T");
        System.out.println(strB);


    }
}
