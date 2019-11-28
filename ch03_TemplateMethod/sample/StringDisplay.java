public class StringDisplay extends AbstractDisplay { // StringDisplayも、AbstractDisplayのサブクラス
    private String string; // 表示するべき文字列
    private int width; // バイト単位で計算した文字列の「幅」
    public StringDisplay(String string) {       // コンストラクタで渡された文字列stringを
        this.string = string;                   // フィールドに記憶、
        this.width = string.getBytes().length;  // 加えてバイト単位の幅もフィールドに記憶しておいて、後で使用
    }
    @Override
    public void open() {
        printLine();
    }
    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }
    @Override
    public void close() {
        printLine();
    }
    private void printLine() {              // openとcloseから呼ばれるprintLineメソッド（privateなのでこのクラスのみ）
        System.out.print("+");              // 枠の角を表現する"+"マークを表示
        for (int i = 0; i < width; i++) {   // 枠線としてwidth個の"-"を表示
            System.out.print("-");
        }
        System.out.println("+");            // 枠の角を表現する"+"マークを表示
    }
}