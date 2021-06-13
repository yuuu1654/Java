public class Main {
  public static void main(String[] args){

    /**
     * 今回は指定した口座の数によって作成するインスタンスの数が変わるので、
     * for文の中で一緒にインスタンスを作成して配列にインスタンスを格納する
     */

    System.out.println("口座をいくつ作りますか？");
    int count = new java.util.Scanner(System.in).nextInt();

    Account[] accounts = new Account[count]; //口座インスタンスを格納する為の配列の宣言

    //指定した回数分口座を作成する処理
    for (int i = 0; i < count; i++){
      System.out.println((i+1) + "つ目の口座を作成します");
      System.out.println("口座番号を入力して下さい");
      int num = new java.util.Scanner(System.in).nextInt();
      System.out.println("暗証番号を入力して下さい");
      int pin = new java.util.Scanner(System.in).nextInt();
      System.out.println("初期預入金額を入力して下さい");
      int amount = new java.util.Scanner(System.in).nextInt();
      //配列accountsにインスタンスを格納していく
      accounts[i] = new Account(num, pin, amount);
    }
    while(true){
      System.out.println("どの処理を実行しますか？");
      System.out.println("---------------------------------------------------");
      System.out.println("1: 預入 2: 引き出し 3: 預入総額表示 4: 終了 ");
      int select = new java.util.Scanner(System.in).nextInt();

      switch (select) {
        case 1: //預入
          //配列の要素数分だけdisplayメソッドの呼び出しを行う
          for(int i = 0; i<accounts.length; i++){
            accounts[i].display(i);
          }
          System.out.println("口座番号を選択して下さい");
          int num1 = new java.util.Scanner(System.in).nextInt();
          System.out.println("預入金額を入力して下さい");
          int money1 = new java.util.Scanner(System.in).nextInt();
          accounts[num1].deposit(money1); //預入の処理の呼び出し
          break;
        case 2: //引き出し
          //配列の要素数分だけdisplayメソッドの呼び出しを行う
          for(int i = 0; i<accounts.length; i++){
            accounts[i].display(i);
          }
          System.out.println("口座番号を選択して下さい");
          int num2 = new java.util.Scanner(System.in).nextInt();
          System.out.println("暗証番号を入力して下さい");
          int pin2 = new java.util.Scanner(System.in).nextInt();
          
          if(accounts[num2].checkPin(pin2) == true){
            System.out.println("引き出し金額を入力して下さい");
            int money2 = new java.util.Scanner(System.in).nextInt();
            accounts[num2].draw(money2); //引き出す処理を実行
          }else{
            System.out.println("暗証番号が違います");
          }
          break;
        case 3: //預入総額表示
          Account.displayTotalAmount(); //静的メソッドはnewせずとも呼び出しが可能
          break;
      }
      if(select == 4){
        System.out.println("終了します");
        break;
      }
    }
  }
}
//System.out.println("");