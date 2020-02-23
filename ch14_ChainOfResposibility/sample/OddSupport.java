public class OddSupport extends Support {
    public OddSupport(String name) {                // コンストラクタ
        super(name);
    }
    @Override
    protected boolean resolve(Trouble trouble) {    // 解決用メソッド
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}