public class Day26 {
    private String secret = "Day26의 캡슐화된 변수";
    String s = "Day26의 인스턴스 변수";

    class MemberClass {
        String s = "Day26의 MemberClass의 인스턴스 변수";

        public void show1() {
            System.out.println("Inter Class");
            System.out.println(secret); // MemberClass안에 secret 변수가 존재하지 않아 바깥 스코프의 secret 변수 값을 출력한다.
            System.out.println(s);  // MemberClass안에 s 변수가 존재
            System.out.println(Day26.this.s);   // Day26의 인스턴스 변수 s의 값을 출력
        }

        static String s3 = "static member field";
        static void info() {
            System.out.println("static member method~");
        }
    }

    public static void main(String[] args) {
        // MemberClass mc = new MemberClass();
        Day26 m = new Day26();
        Day26.MemberClass mc = m.new MemberClass();

        System.out.println(mc.s); // "Day26의 MerberClass의 인스턴스 변수"
        mc.show1();
        mc.s3 = "test";
        System.out.println(Day26.MemberClass.s3);
        Day26.MemberClass.info();
    }
}