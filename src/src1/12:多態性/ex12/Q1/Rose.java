public class Rose extends Plant {
  
  //コンストラクタ
  public Rose(String name, String color){
    super(name, color);
  }

  //実装メソッド
  public void live(){
    System.out.println(this.name + "は光合成して生きる");
  }
}
