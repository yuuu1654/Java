public class NoteBook extends Book {
  //Bookクラスを継承
  //サブクラス

  //フィールド
  //contentには最初空欄の状態にしておきたい
  String content = "";

  //コンストラクタ
  //親クラスBookの引数２つのコンストラクタをsuper()で呼び出す
  public NoteBook(int page, int price){
    super(page, price);
  }


  //表示メソッド
  public void display(){
    //ページ数・価格を表示させる部分はBookクラスのdisplayメソッドを継承
    super.display();
    //内容表示だけ追加
    System.out.println("書き込み内容:" + this.content);
  }

  //追加書き込みメソッド
  public void write(){
    System.out.println("書き込む内容を書いて下さい");
    String written = new java.util.Scanner(System.in).nextLine();
    content += written;
    System.out.println("書き込みました");
  }
}
