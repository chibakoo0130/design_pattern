import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();   // 乱数発生器
    private int number;                     // 現在の数
    @Override
    public int getNumber() {                // 数を取得する
        return number;
    }
    @Override
    public void excute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}