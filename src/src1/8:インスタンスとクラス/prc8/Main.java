public class Main {
  public static void main(String[] args){

    //聖職者インスタンス生成
    Cleric c = new Cleric();
    c.selfAid();
    c.pray(3);
    System.out.println("現在のMP：" + c.mp);
  }
}
