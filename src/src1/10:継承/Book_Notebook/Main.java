public class Main {
  public static void main(String[] args){
    //System.out.println("Hello world!");

    System.out.println("本のページ数を入力してください");
    int bookPage = new java.util.Scanner(System.in).nextInt();

    System.out.println("ほんの価格を入力してください");
    int bookPrice = new java.util.Scanner(System.in).nextInt();

    //Bookインスタンス生成
    //Bookクラスのメソッドやフィールドを使えるようになる
    Book b = new Book(bookPage, bookPrice);



    System.out.println("ノートのページ数を入力してください");
    int notePage = new java.util.Scanner(System.in).nextInt();

    System.out.println("ノートの価格を入力してください");
    int notePrice = new java.util.Scanner(System.in).nextInt();

    //NoteBookインスタンス生成
    //NoteBookクラスのメソッドやフィールドを呼び出して使える
    NoteBook nb = new NoteBook(notePage, notePrice);
    
    while(true){
      System.out.println("どの処理を実行しますか？");
      System.out.println("--------------------------------------------------------------");
      System.out.println("1.ほんの情報表示 / 2.ノートの情報表示 / 3.ノートに追加書き込み / 4.終了");

      int select = new java.util.Scanner(System.in).nextInt();

      switch (select) {
        case 1:
          b.display();
          break;
        case 2:
          nb.display();
          break;
        case 3:
          nb.write();
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