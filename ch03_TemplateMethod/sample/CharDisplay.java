public class CharDisplay extends AbstractDisplay { // CharDisplayは、AbstractDisplayのサブクラス
    private char ch; // 表示すべき文字
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    @Override
    public void open() { // オーバーライドして実装
        System.out.print("<<"); // 開始文字列として"<<"を表示
    }
    @Override
    public void print() { // オーバーライドして実装
        System.out.print(ch); 
    }
    @Override
    public void close() { // オーバーライドして実装
        System.out.println(">>"); // 終了文字列として">>"を表示
    }
}