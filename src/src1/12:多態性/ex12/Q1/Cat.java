public class Cat extends Animal {
  
  //コンストラクタ
  public Cat(String name, String voice){
    super(name, voice);
  }

  //実装メソッド(生きる)
  public void live(){
    System.out.println(this.name + "はのんびり生活する");
  }
}
