public class CoinCase {
  //硬貨の入れ物クラス
  /**
   * 仮引数はフィールドに定義しなくても良い
   */

  //private int coinType; //硬貨の種類

  //private int num;  //入力された枚数

  private int count500 = 0; //硬貨の枚数カウント
  private int count100 = 0;
  private int count50 = 0;
  private int count10 = 0;
  private int count5 = 0;
  private int count1 = 0;

  //private int amount = 0; //硬貨の総額


  //硬貨を追加するメソッド（種類/枚数）
  public void addCoins(int coinType, int num){
    switch (coinType) {
      case 500:
        this.count500 += num;
        break;
      case 100:
        this.count100 += num;
        break;
      case 50:
        this.count50 += num;
        break;
      case 10:
        this.count10 += num;
        break;
      case 5:
        this.count5 += num;
        break;
      case 1:
        this.count1 += num;
        break;
    }
  }


  //指定した硬貨が何枚あるかを取得するメソッド(引数：硬貨の種類int/戻り値: 枚数int)
  public int getCount(int coinType){
    switch (coinType) {
      case 500:
        return this.count500;
      case 100:
        return this.count100;
      case 50:
        return this.count50;
      case 10:
        return this.count10;
      case 5:
        return this.count5;
      case 1:
        return this.count1;
    }
    return 0; //このreturnってなんで必要なん？？？
  }

  //全ての硬貨の枚数を取得するメソッド(引数：なし)
  public int getCount(){
    return this.count500 + this.count100 + this.count50 + this.count10 + this.count5 + this.count1; 
  }


  //硬貨の総額取得するメソッド (戻り値：　総額int)
  public int getAmount(){
    return this.count500*500 + this.count100*100 + this.count50*50 + this.count10*10 + this.count5*5 + this.count1*1;
  }

  //指定した種類の硬貨の総額を取得（引数：あり）
  public int getAmount(int coinType){
    switch (coinType) {
      case 500:
        return this.count500*500;
      case 100:
        return this.count100*100;
      case 50:
        return this.count50*50;
      case 10:
        return this.count10*10;
      case 5:
        return this.count5*5;        
      case 1:
        return this.count1*1;
    }

    return 0;
  }


  


}
