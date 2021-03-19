class FizzBuzz
{
  public static void main(String args[])
  {
    int i = 1;
    while (i <= 100)
    {
      if (i % 3 == 0)
      {
        System.out.println("Fizz");
      }
      else
      {
        System.out.println(i);
      }
      i += 1;
    }
  }
}
