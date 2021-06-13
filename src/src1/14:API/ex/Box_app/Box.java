public class Box {
  
  private String color;
  private String shape;
  private int ballAmount;
  private static int totalBallAmount;

  //コンストラクタ
  public Box(String color, String shape){
    this.color = color;
    this.shape = shape;
  }

  
  //メソッド
  public void insertBalls(int num1){
    //引数の個数だけボールを箱に入れる
    this.ballAmount += num1;
    Box.totalBallAmount += num1;
    System.out.println(this.color + "の箱に" + num1 + "個のボールを入れました");
    
  }

  public void removeBalls(int num2){
    //引数の個数だけボールを取り出す
    //if文作成
    if(this.ballAmount < num2){
      System.out.println(this.ballAmount + "個のボールを取り出しました");
      Box.totalBallAmount -= this.ballAmount;
      this.ballAmount = 0;
    }else{
      this.ballAmount -= num2;
      Box.totalBallAmount -= num2;
      System.out.println(num2 + "個のボールを取り出しました");
    }
  }

  public void displayInfo(int num3){
    //箱の色・形・ボールの数を表示する
    System.out.println(num3 + "--色: " + this.color + "/形: " + this.shape + "/個数: " + this.ballAmount);
  }

  public static void displayTotalNumber(){
    //全ての箱のボールの総数を表示する
    if (Box.totalBallAmount <= 0){
      System.out.println("ボールの合計は、0");
    }else{
      System.out.println("ボールの合計は" + Box.totalBallAmount);
    }
  }

  

}
//System.out.println("");