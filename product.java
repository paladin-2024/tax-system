import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        Scanner ali= new Scanner(System.in);

        String  product_name;
        int weight;
        System.out.println("Please enter the product name");
        product_name=ali.nextLine();
        System.out.println("Please enter the product weight");
        weight=ali.nextInt();
        
        if (weight>=11 && weight<=30)
        
        {
            System.out.println("is it cassava or maize?");
            String cassava=ali.next();

            if (cassava.equals("cassava")){
                System.out.println("You must pay a tax of 165$ for cassava.");
                 System.out.println("Congratulatin you are the winner of a bonus of 10$.");
                
            }
            else if (cassava.equals("maize"))
            {
                System.out.println("You must pay a tax of 150$ for maize.");
                 System.out.println("Congratulatin you are the winner of a bonus of 10$.");
            } 
        }

        else if(weight>=31 && weight<=50){
            System.out.println("is it cassava or maize?");
            String cassava=ali.next();
            if (cassava.equals("cassava")){
                System.out.println("You must pay a tax of 255$ for cassava.");
                System.out.println("Congratulatin you are the winner of a bonus of 12$.");
                
            }
            else if (cassava.equals("maize"))
            {
                System.out.println("You must pay a tax of 200$ for maize.");
                System.out.println("Congratulation you are the winner of a bonus of 12$.");
            }
        }

        else if(weight>=51 && weight<=70){

            System.out.println("is it cassava or maize?");
            String cassava=ali.next();

            if (cassava.equals("cassava")){
                System.out.println("You must pay a tax of 265$ for cassava.");
                System.out.println("Congratulatin you are the winner of a bonus of 14$.");
                
            }
            else if (cassava.equals("maize"))
            {
                System.out.println("You must pay a tax of 250$ for maize.");
               System.out.println("Congratulatin you are the winner of a bonus of 14$.");
            }
        }
        else if(weight>=71 && weight<=90){

            System.out.println("is it cassava or maize?");
            String cassava=ali.next();

            if (cassava.equals("cassava")){
                System.out.println("You must pay a tax of 325$ for cassava.");
                System.out.println("Congratulatin you are the winner of a bonus of 16$.");
                
            }
            else if (cassava.equals("maize"))
            {
                System.out.println("You must pay a tax of 300$ for maize.");
               System.out.println("Congratulatin you are the winner of a bonus of 16$.");
            }
        }
        else if(weight>=91 && weight<=100){

            System.out.println("is it cassava or maize?");
            String cassava=ali.next();

            if (cassava.equals("cassava")){
                System.out.println("You must pay a tax of 375$ for cassava.");
                System.out.println("Congratulatin you are the winner of a bonus of 18$and a free packing.");
                
            }
            else if (cassava.equals("maize"))
            {
                System.out.println("You must pay a tax of 350$ for maize.");
               System.out.println("Congratulatin you are the winner of a bonus of 18$ and a free packing.");
            }
        }
        else {
            System.out.println("is it cassava or maize?");
            String cassava=ali.next();

            if (cassava.equals("cassava")){
                System.out.println(" Thank you for supporting us but You must pay a tax of 120$ for maize.");
            }
            else if (cassava.equals("maize"))
            {
                System.out.println(" Thank you for supporting us but You must pay a tax of 100$ for maize.");
            
            }
        }
    }
}
