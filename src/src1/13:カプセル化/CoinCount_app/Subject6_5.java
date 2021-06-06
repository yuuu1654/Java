public class Subject6_5 {
  
  public static void main(String[] args){

    //CoinCaseインスタンスの生成
    CoinCase c2 = new CoinCase();

    for (int i = 0; i<3; i++){
      System.out.println("硬貨の種類を入力して下さい");
      System.out.println("1: 500円玉 2: 100円玉 3: 50円玉 4: 10円玉 5: 5円玉 6: 1円玉 ");
      /**
       * 変数の初期化の手間を省く為に、分けずに直接代入しても良い
       */
      int select = new java.util.Scanner(System.in).nextInt();
      int coinType; //コインの種類を格納する変数(変数の初期化忘れないようにする)→switch文でデフォルトを用意していたら大丈夫
      switch (select) {
        case 1:
          coinType = 500;
          break;
        case 2:
          coinType = 100;
          break;
        case 3:
          coinType = 50;
          break;
        case 4:
          coinType = 10;
          break;
        case 5:
          coinType = 5;
          break;
        case 6:
          coinType = 1;
          break;
        default:
          coinType = 0;
      }

      System.out.println("硬貨の枚数を入力して下さい");
      int num = new java.util.Scanner(System.in).nextInt();

      //addCoinsメソッドの呼び出し
      c2.addCoins(coinType, num);
    }

    //硬貨の総枚数を表示
    System.out.println("硬貨の総枚数：" + c2.getCount() + "枚です");

    System.out.println("500円玉 :" + c2.getCount(500) + "枚" + c2.getAmount(500) + "円");
    System.out.println("100円玉 :" + c2.getCount(100) + "枚" + c2.getAmount(100) + "円");
    System.out.println("50円玉 :" + c2.getCount(50) + "枚" + c2.getAmount(50) + "円");
    System.out.println("10円玉 :" + c2.getCount(10) + "枚" + c2.getAmount(10) + "円");
    System.out.println("5円玉 :" + c2.getCount(5) + "枚" + c2.getAmount(5) + "円");
    System.out.println("1円玉 :" + c2.getCount(1) + "枚" + c2.getAmount(1) + "円");

    System.out.println("総額は" + c2.getAmount() + "円");


  }

}
//System.out.println("");