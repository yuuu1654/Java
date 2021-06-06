public class Subject6_4 {
  public static void main(String[] args){


    //インスタンス生成してメソッド呼び出せるようにする
    CoinCase c1 = new CoinCase();

    for (int i = 0; i<3; i++){
      System.out.println("硬貨の種類を入力して下さい");
      System.out.println("1: 500円玉 2: 100円玉 3: 50円玉 4: 10円玉 5: 5円玉 6: 1円玉 ");
      int coinType = new java.util.Scanner(System.in).nextInt();

      switch (coinType) {
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
      }

      System.out.println("硬貨の枚数を入力して下さい");
      int num = new java.util.Scanner(System.in).nextInt();

      c1.addCoins(coinType, num);
    }

    System.out.println("500円玉 :" + c1.getCount(500) + "枚");
    System.out.println("100円玉 :" + c1.getCount(100) + "枚");
    System.out.println("50円玉 :" + c1.getCount(50) + "枚");
    System.out.println("10円玉 :" + c1.getCount(10) + "枚");
    System.out.println("5円玉 :" + c1.getCount(5) + "枚");
    System.out.println("1円玉 :" + c1.getCount(1) + "枚");

    System.out.println("総額は" + c1.getAmount() + "円");
  }
}

//System.out.println("");