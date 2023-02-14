public class Pairi extends Pokemon {
    private String name = "파이리";
    public Pairi(String owner, String skills) {
        super(owner, skills);
    }

    @Override
    public void attack(int idx) {
        System.out.println("[파읠파읠] " + getOwner() + "의 " + name + "가 "+ getSkills().get(idx) + "공격 시전!");
    }
}
