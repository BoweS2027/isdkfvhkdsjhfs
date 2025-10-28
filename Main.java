  import java.util.Scanner;
  public class Main {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("enter name of school");
   String e1=input.nextLine();
   System.out.println("enter the amount of drinks");
   int a1=input.nextInt();
   System.out.println("enter the amount of candy");
   int b1=input.nextInt();
   System.out.println("enter the amount of Hot Dogs");
   int c1=input.nextInt();
   System.out.println("enter the amount of Hamburgers");
   int d1=input.nextInt();
   String fl = e1.substring(0,1);
   int position = e1.indexOf(" ");
   System.out.println(position);
   String sl = e1.substring(position+1,position+2);
   String nofw = e1.substring(position+1);
   int position2 = nofw.indexOf(" ");
   String tl = nofw.substring(position2+1,position2+2);
     // RECEIPT PRINTOUT SECTION
     String hs = fl+sl+tl;
     String d = " Drink";
     String c = " Candy";
     String hd = " Hot Dog";
     String h = " Hamburger";
     double dp = (a1);
     double cp = (b1);
     double hdp = (c1);
     double hp = (d1);
     double total = dp*1.5 + cp*1.25 + hdp*2.75 + hp*3.5;
     System.out.println("**************************************");
     System.out.println("*                              *");
     System.out.println("*     " + hs + " Snack Bar     *");
     System.out.println("*     " +(int)(dp)+ d + " ..........$1.50     *");                      
     System.out.println("*     " +(int)(cp)+ c + " ..........$1.25     *");     
     System.out.println("*     " +(int)(hdp)+ hd + " ..........$2.75     *");     
     System.out.println("*     " +(int)(hp)+ h + " ..........$3.50      *");     
     System.out.println("tax rate is 9%");    
     System.out.println("subtotal is " + total);
     System.out.println("tax is " + total*.09);
     System.out.println("total is " + total*1.09);
  }
  }

