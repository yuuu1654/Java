public class Book extends TangibleAsset {

  
  String isbn;

  //コンストラクタ
  public Book(String name, int price, String color, String isbn){
    super(name, price, color);
    this.isbn = isbn;
  }

  //メソッド(戻り値の型を指定)
  
  public String getIsbn(){ return this.isbn }
}
