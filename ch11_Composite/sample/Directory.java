import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;                            // ディレクトリの名前
    private ArrayList directory = new ArrayList();  // ディレクトリエントリの集合
    public Directory(String name) {                 // コンストラクタ
        this.name = name;
    }
    @Override
    public String getName() {                       // 名前を得る
        return name;
    }
    @Override
    public int getSize() {                          // サイズを得る
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    @Override
    public Entry add(Entry entry) {                 // エントリの追加
        directory.add(entry);
        return this;
    }
    @Override
    protected void printList(String prefix) {       // エントリの一覧
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}