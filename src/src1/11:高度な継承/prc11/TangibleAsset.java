public abstract class TangibleAsset extends Asset implements Thing {
  //Computer,Bookクラスの親クラス(有形資産)

  /**
   * Computer,Bookクラスから共通部分を抜き出す
   * 親クラス(Assetクラス)に共通部分をリファクタリングした
   */

  
  String color;

  //コンストラクタ
  public TangibleAsset(String name, int price, String color){
    //name,priceはAssetクラスから継承
    super(name, price);
    this.color = color;
  }

  //メソッド
  public String getColor(){ return this.color; }
}
