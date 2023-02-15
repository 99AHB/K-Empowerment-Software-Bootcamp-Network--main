class One{
    private One() {
    }
    public static One produceOneInstance(){
        return new One();
    }
}
public class Test {
    public static void main(String[] args) {
        //One o = new One();
        One o1 = One.produceOneInstance();
        One o2 = One.produceOneInstance();
    }
}