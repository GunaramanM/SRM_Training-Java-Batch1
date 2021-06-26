package Converter;

import java.util.*;

public class Currency {
    public void Convert() {
        double inr, usd, yen, euro;
        System.out.println("\nINR to other currency");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter INR to convert: ");
        inr = in.nextDouble();
        usd = inr/69;
        System.out.println("USD= " +usd+" dollars");
        yen= inr*1.4;
        System.out.println("YEN= " +yen+" yens");
        euro=inr/89;
        System.out.println("EURO= " +euro+" euros");


        System.out.println("\nOther currency to INR");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        inr=sc.nextDouble();
        usd= inr*69;
        System.out.println("USD to INR= " +usd+" Rupees");
        yen=inr/1.4;
        System.out.println("YEN to INR= " +yen+" Rupees");
        euro=inr*89;
        System.out.println("EURO to INR= " +euro+" Rupees");

    }
}