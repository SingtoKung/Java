public class Scope {
  public static void main(String[] args) {
    float testRate = 8.5f;
    {
      float interestRate = 7.5f;
      System.out.println(interestRate);
      System.out.println("Inside: " + testRate);
    }
    System.out.println("Outside: " + testRate);
  }
}
