public class Main {


  private static void PrintTree(int height) {
    String I = "I";
    String M = "M";
    System.out.println(I);
    for (int i = 2; i < height; i++) {
      System.out.println(PrintXY(i));

    }
    System.out.println(M);
  }

  // print XY string based on string length
  private static String PrintXY(int length) {
    String text = "";
    for (int i = 1; i <= length; i++) {
      if (i % 2 == 0) {
        text = text + "Y";
      } else {
        text = text + "X";

      }
    }
    return text;
  }

  public static void main(String[] args) {
    PrintTree(6);
  }


}


