public class Book {
  //親クラス(スーパークラス)

  //フィールド
  int page;
  int price;

  //コンストラクタ
  //インスタンス生成時に２つの引数をもらってフィールドに値をセットする
  public Book(int page, int price){
    this.page = page;
    this.price = price;
  }


  //表示メソッド
  public void display(){
    System.out.println("ページ数:" + this.page);
    System.out.println("価格:" + this.price);
  }

}
