public class Thief {
  //フィールドの設定
  String name;
  int hp;
  int mp;

  //コンストラクタの定義
  //引数3つを受け取りインスタンス化する
  public Thief(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public Thief(String name, int hp){
    // 他のコンストラクタを呼び出してコードの重複をなくす
    this(name, hp, 5);
  }

  public Thief(String name){
    // 他のコンストラクタを呼び出してコードの重複をなくす
    this(name, 40, 5);
  }


}
