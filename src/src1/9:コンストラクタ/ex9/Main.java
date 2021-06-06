public class Main {

  public static void heal(int hp){
    hp += 10;
  }

  public static void heal(Thief thief){
    thief.hp += 10;
  }

  public static void main(String[] args){
    int baseHp = 25;

    //インスタンス生成
    Thief t = new Thief("朝香", baseHp);

    //baseHpの値が25なので、hpも25
    System.out.println(baseHp + " : " + t.hp);

    heal(baseHp);
    heal(t);
    System.out.println(baseHp + " : " + t.hp);
  }
}
//System.out.println("");