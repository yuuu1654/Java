public class Main {
  public static void main(String[] args){
    //アプリケーションクラス

    //動物でまとめた処理
    Animal[] array1 = new Animal[2];
    array1[0] = new Dog("柴犬", "わんわん");
    array1[1] = new Cat("タマ", "にゃーにゃー");
    for (Animal a : array1){
      a.bark();
    }


    //植物でまとめた処理
    Plant[] array2 = new Plant[2];
    array2[0] = new Rose("薔薇", "赤色");
    array2[1] = new Sunflower("ひまわり", "黄色");
    for (Plant p : array2){
      p.makeFlowers();
    }


    //生き物でまとめた処理
    Creature[] array3 = new Creature[4];
    array3[0] = new Dog("柴犬", "わんわん");
    array3[1] = new Cat("タマ", "にゃーにゃー");
    array3[2] = new Rose("薔薇", "赤色");
    array3[3] = new Sunflower("ひまわり", "黄色");
    for (Creature c : array3){
      c.live();
    }
  }
}
