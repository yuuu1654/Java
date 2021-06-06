public class Cleric {
  //聖職者クラス

  String name;
  int hp = 50;
  int mp = 10;
  final int MAX_HP = 50;
  final int MAX_MP = 10;

  //セルフエイドメソッド
  public void selfAid(){
    System.out.println("聖職者はセルフエイドを唱えた！");
    this.mp -= 5;
    System.out.println("MPを５消費した");
    System.out.println("現在のMP：" + this.mp);
    this.hp = this.MAX_HP;
    System.out.println("現在のHP：" + this.hp);
  }

  //祈るメソッド
  public int pray(int sec){
    System.out.println("聖職者は祈りを捧げた！");

    int plus = new java.util.Random().nextInt(3);
    int recover = sec + plus; //補正を含めた回復量
    int actualRecover; //実際の回復量

    if (this.MAX_MP - this.mp > recover){
      actualRecover = recover;
      this.mp += actualRecover;
      System.out.println("MPが" + actualRecover + "回復した");
      return actualRecover;
    }else{
      actualRecover = this.MAX_MP - this.mp;
      this.mp += actualRecover;
      System.out.println("MPが" + actualRecover + "回復した");
      return actualRecover;
    }
  }

}
//System.out.println("");