package day3;

public class Dice {

  public static void main(String[] args) {
    int dice = (int) (Math.random() * 7) + 1;
    System.out.println("サイコロの目" + dice);
    if (1 <= dice && dice <= 6) {
      if (dice == 2 || dice == 4 || dice == 6) {
        System.out.println("丁です");
      } else {
        System.out.println("半です");
      }
    } else {
      System.out.println("半以外の数値です");
    }
  }
}
