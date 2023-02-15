package Ex;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamEx3 {
    static int i = 0;
    public static void main(String[] args) {
        Stream<String> member;
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
        member = names.stream();
        Stream<Member> sm = member.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        System.out.println("\n[Member 스트림 원소]");
        sm.forEach(m -> System.out.print(m + " "));
        System.out.println();
        i = 0;
        member = names.stream();
        sm = member.map(n -> new Member(n, genders.get(i), ages.get(i++)));
        Map<Gender, List<Member>> map = sm.collect(Collectors.groupingBy(Member::getGender));
        System.out.println("\n[Member 스트림을 성별로 그룹핑]");
        System.out.println(map);
    }
}
enum Gender {
    남, 여
}
class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }
}