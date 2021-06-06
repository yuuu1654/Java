public abstract class Animal implements Creature {
  /**
   * 抽象メソッド
   * newによるインスタンス化は出来ない
   * Creatureインターフェースを実装する
   * 普通の抽象クラスではpublic abstract省略不可
   */

  
  //フィールド
  String name;
  String voice;

  //コンストラクタ
  public Animal(String name, String voice){
    this.name = name;
    this.voice = voice;
  }

  //抽象メソッド(生きる)
  public abstract void live();

  //実装メソッド(吠える)
  public void bark(){
    System.out.println(this.name + "は" + this.voice);
  }
}
//System.out.println();