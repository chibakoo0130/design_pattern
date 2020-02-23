public class Trouble {
    private int number;             // トラブル番号
    public Trouble(int number) {    // トラブルの生成
        this.number = number;
    }
    public int getNumber() {        // トラブル番号を得る
        return number;
    }
    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}