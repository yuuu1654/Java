public class Main {
  public static void main(String[] args){

    /**
     * それぞれのインスタンス毎ににフィールドの初期値をかえる
     * インスタンス生成時にコンストラクタに情報を渡す
     */

    //インスタンス生成
    Box b0 = new Box("赤色", "四角形");
    Box b1 = new Box("緑色", "円形");
    Box b2 = new Box("黄色", "三角形");

    while(true){
      System.out.println("どの処理を実行しますか？");
      System.out.println("1: ボール投入 2: ボール取り出し 3: ボール総数表示 4: 終了 ");
      int select = new java.util.Scanner(System.in).nextInt();

      switch (select) {
        case 1: //ボール投入
          b0.displayInfo(0);
          b1.displayInfo(1);
          b2.displayInfo(2);
          System.out.println("ボールを投入する箱の番号を入力して下さい");
          int num1 = new java.util.Scanner(System.in).nextInt();
          System.out.println("投入するボールの個数を入力して下さい");
          int count1 = new java.util.Scanner(System.in).nextInt();
          switch (num1) {
            case 0: //赤色
              b0.insertBalls(count1);
              break;
            case 1: //緑色
              b1.insertBalls(count1);
              break;
            case 2: //黄色
              b2.insertBalls(count1);
              break;
          }
          break;
        case 2: //ボール取り出し
          b0.displayInfo(0);
          b1.displayInfo(1);
          b2.displayInfo(2);
          System.out.println("ボールを取り出す箱の番号を入力して下さい");
          int num2 = new java.util.Scanner(System.in).nextInt();
          System.out.println("取り出すボールの個数を入力して下さい");
          int count2 = new java.util.Scanner(System.in).nextInt();
          switch (num2) {
            case 0: //赤色
              b0.removeBalls(count2);
              break;
            case 1: //緑色
              b1.removeBalls(count2);
              break;
            case 2: //黄色
              b2.removeBalls(count2);
              break;
          }
          break;
        case 3: //ボール総数表示
          Box.displayTotalNumber();
          break;
        default:
          break;
      }
      if (select == 4){
        System.out.println("終了します");
        break;
      }
    }
  }
}
//System.out.println("");