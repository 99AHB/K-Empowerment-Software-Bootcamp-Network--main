import java.util.Arrays;
public class qwer {
    public static void main(String[] args) {
        String[]strings = {"실험1","실험22","실험333"};
        Arrays.sort(strings,(first,second) ->first.length() - second.length());
        for (String s : strings)
            System.out.println(s);
    }
}
