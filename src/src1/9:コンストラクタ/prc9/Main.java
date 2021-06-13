public class Main {
  z
  //(引数がint型)
  public static void heal(int hp){
    hp += 10;
  }
  //(引数がクラス型)
  public static void heal(Thief thief){
    thief.hp += 10;
  }

  public static void main(String[] args){
    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp);
    System.out.println(baseHp + " : " + t.hp);

    //値そのものが渡される呼び出し→値渡し(引数がint型)
    heal(baseHp);

    //変数tが示すアドレスが引数thiefにコピーされる→参照渡し(引数がクラス型)
    heal(t);

    System.out.println(baseHp + " : " + t.hp);
  }
}
