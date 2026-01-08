public class Retain{
 public static void main(String[]args){
    int a=50,b=70,c=80;
    double price;
    price=((a*2)+b+(c*3));
    price=price-(.1*price);
    price=price+(0.05*price);
    System.out.println(price);
    }
}