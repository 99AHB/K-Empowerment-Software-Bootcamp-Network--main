package Ex;

import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<String> members;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        members = names.stream();
        members.filter(n -> n.charAt(0) < '이').forEach(n -> System.out.print(n + " "));
        System.out.println();
        members = names.stream();
        members.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        members = names.stream();
        System.out.println(members.findFirst());
        members = names.stream();
        System.out.println(members.findFirst().get());
        members = names.stream();
        System.out.println(members.count());
    }
}
