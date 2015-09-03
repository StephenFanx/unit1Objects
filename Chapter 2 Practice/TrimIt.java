public class TrimIt
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
       
      String message = sentence1;
      message = message.concat(sentence2);
      message = message.concat(sentence3);
      message = message.replace(" ", "");

      System.out.println(message);
   }
}