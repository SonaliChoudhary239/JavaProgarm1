import java.util.Scanner;
 class cafe {
    public static void main(String args[])
    {
        double tea=10,coffee=20, coldcoffee=80,sanwitch=100;
        System.out.println("Good mornig");
        System.out.println("What would you like to order?");
        System.out.println("               pls provide me menu           ");
        System.out.println("  This is menu our cafe  ");
        System.out.println("Tea - 10 RS");
        System.out.println("coffe - 20 RS");
        System.out.println("cold coffe - 80 RS");
        System.out.println("sandwich - 100 RS");
        System.out.println("What would you like to order");
        Scanner sc=new Scanner(System.in);
        System.out.println("Quntity of tea");
        double qt=sc.nextDouble();
        System.out.println("Quntity of coffe");
        double qt1=sc.nextDouble();
        System.out.println("Quntity of cold coffe");
        double qt2=sc.nextDouble();
        System.out.println("Quntity of sndwidch");
        double qt3=sc.nextDouble();
        double totalbill =tea *qt+ coffee*qt1 + coldcoffee*qt2 + sanwitch*qt3;
        double gst =totalbill * (0.05);
        double finalbill= totalbill+gst;
        System.out.println("your final bill is =" + finalbill);


    }

    
}
