import java.util.Scanner;
class ForLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in); 
       
        System.out.println("Enter a Number");
        n=sc.nextInt();
        for (int i = n; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
