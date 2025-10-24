  public class Main {
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION
     String hs = "BWL";
     String d = "Drink";
     String c = "Candy";
     String hd = "Hot Dog";
     String h = "Hamburger";
     int dp = (int) (Math.random()*100);
     int cp = (int) (Math.random()*100);
     int hdp = (int) (Math.random()*100);
     int hp = (int) (Math.random()*100);
     double total = dp*1.5 + cp*1.25 + hdp*2.75 + hp*3.5;
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + hs + " Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     " +dp+ d + " ..........$1.50          *");                      
     System.out.println("*     " +cp+ c + " ..........$1.25          *");     
     System.out.println("*     " +hdp+ hd + " ..........$2.75          *");     
     System.out.println("*     " +hp+ h + " ..........$3.50          *");     
     System.out.println("tax rate is 9%");    
     System.out.println("subtotal is " + total);
     System.out.println("tax is " + total*.09);
     System.out.println("total is " + total*1.09);
  }
  }

