public class Dog extends Animal {
  /**
   * newによるインスタンス化できる
   */

  //コンストラクタ
  public Dog(String name, String voice){
    super(name, voice);
  }

  //実装メソッド(生きる)
  public void live(){
    System.out.println(this.name + "は無邪気に生活する");
  }
}
