public class Main {

  public static Boolean Isprime(int number) {
    Boolean Temp = false;

    if (number == 1)
      Temp = true;
    else {
      for (int i = 2; i * 2 <= number; i++) {
        if (number % i == 0)
          Temp = false;
        else Temp = true;
      }

    }
    return Temp;
  }

  public static void Primeoutput(Boolean Flag){
    if (Flag)
      System.out.println("the number is prime");
    else
      System.out.println("the number is Not prime");

  }

  public static void main (String[]args){

    Primeoutput(Isprime(1));

  }
}

