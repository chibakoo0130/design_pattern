public class StringDisplayImpl extends DisplayImpl {
    private String string;                      // 表示するべき文字列
    private int width;                          // バイト単位で計算した文字列の幅
    public StringDisplayImpl(String string) {   // コンストラクタで渡された文字列stringを、
        this.string = string;                   // フィールドに記憶しておく。
        this.width = string.getBytes().length;  // さらにバイト単位の幅もフィールドに記憶
    }
    @Override
    public void rawOpen() {
        printLine();
    }
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|"); // 前後に"|"をつけて表示
    }
    @Override
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                  // 枠の角を表現する"+"を表示
        for (int i = 0; i < width; i++) {           // 枠線としてwidth個の"-"を表示
            System.out.print("-");
        }
        System.out.println("+");                // 枠の角を表現する"+"を表示
    }
}