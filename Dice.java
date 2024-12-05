public class Dice{
  int me; //型・変数名


  void roll(){
    me=(int )(Math.random()*6) + 1;
  }//void＝変数型なし　・　変数名　（）は引数の型
}//Diceというクラスは