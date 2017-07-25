package lesson4;

/**
 * Created by user on 02.06.2017.
 */
public class ConcaterExampie {
    public static void main(String[] args) {
        String res = concat((String) "first", (String)"second" , (String)"third");
        System.out.println(res);

    }
    public static String concat (String a ,String b , String c){
        String res = a + b + c;
        return res;
    }
}
