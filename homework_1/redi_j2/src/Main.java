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

  private static String PrintXY(int length) {

    StringBuilder text = new StringBuilder();
    for (int i = 1; i <= length; i++) {
      if (i % 2 == 0) {
        text.append("Y");
      } else {
        text.append("X");

      }
    }
    return text.toString();
  }

  public static void main(String[] args) {
    PrintTree(6);


  }


}


