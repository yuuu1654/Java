public abstract class Plant implements Creature {
  /**
   * 抽象クラス
   * Creatureインターフェースを実装
   * 普通の抽象クラスではpublic abstract省略不可
   */

  //フィールド
  String name;
  String color;

  
  //コンストラクタ
  public Plant(String name, String color){
    this.name = name;
    this.color = color;
  }


  //抽象メソッド(生きる)
  public abstract void live();


  //実装メソッド(花を咲かせる)
  public void makeFlowers(){
    System.out.println(this.name + "は" + this.color + "の花を咲かせる");
  }

}
