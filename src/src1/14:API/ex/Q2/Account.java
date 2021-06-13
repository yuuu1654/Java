public class Account {
  
  private int num; //口座番号
  private int pin; //暗証番号
  private int amount; //預入金額
  private static int totalAmount; //全口座の預入金額の総額


  //コンストラクタ
  public Account(int num, int pin, int amount){
    this.num = num; 
    this.pin = pin; 
    this.amount = amount; 
    this.totalAmount += amount; //totalAmountにもamountを初期値としてset
  }

  public boolean checkPin(int p){
    //暗証番号が正しいかチェック
    //booleanの戻り値を返す
    boolean result = false;
    if(this.pin == p){
      result = true;
    }
    return result;
  }

  public void deposit(int money){
    //引数に指定した金額を口座に入れる
    this.amount += money;
    Account.totalAmount += money; //共有物
    System.out.println(money + "円預入しました");
  }

  public void draw(int money){
    //引数に指定した金額を口座から引き出す
    //残高が不足する場合は引き出さない
    //totalAmount が amount よりも少ないという状況があり得ないので0以下の処理は考えなくても良い
    if(this.amount < money){
      System.out.println("残高が不足しています");
    }else{
      this.amount -= money;
      Account.totalAmount -= money;
      System.out.println(money + "円引き出しました");
    }
  }

  public void display(int index){
    System.out.println(index + "--口座番号" + this.num + "残高" + this.amount);
  }

  public static void displayTotalAmount(){
    //全口座の預入金額の総額を表示する
    //クラスメソッド
    System.out.println("全口座の残高の合計は" + Account.totalAmount + "円です");
  }


  
}
