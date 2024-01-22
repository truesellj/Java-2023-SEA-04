package PA303101;

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new StoneMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new FireMonster();
        Monster bossMonster = new Monster();

        m3.attack();
        m1.attack();
        m2.attack();
        bossMonster.attack();
    }
}
