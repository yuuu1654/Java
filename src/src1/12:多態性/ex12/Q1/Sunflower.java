public class Sunflower extends Plant {
  
  //コンストラクタ
  public Sunflower(String name, String color){
    super(name, color);
  }

  //実装メソッド
  public void live(){
    System.out.println(this.name + "は太陽の方向を向いて光合成をして生きる");
  }
}
