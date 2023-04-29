import java.util.*;;
public class Cardetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter supercar/car price:-");
        int price=sc.nextInt();
        System.out.println("enter capacity of car:-");
        int cap=sc.nextInt();
        Suparcar c1=new Suparcar();
        c1.setPrice(price);
        c1.getPrice();
        c1.setCapacity(cap);
        c1.getCapacity();
    }
}
