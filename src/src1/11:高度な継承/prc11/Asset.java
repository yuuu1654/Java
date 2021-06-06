public abstract class Asset {
  //抽象クラス

  /**
   * 全てが抽象メソッドでなくても良い
   * フィールドも含んで良い
   * 
   */

  //フィールド
  String name;
  int price;

  //コンストラクタ
  public Asset(String name, int price){
    this.name = name;
    this.price = price;
  }

  //メソッド
  public String getName(){ return this.name; }
  public int getPrice(){ return this.price; }
}
