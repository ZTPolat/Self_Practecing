package loop_Practice02;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String item ;
        double price , totalPrice = 0.00;
        int quantity =0;



        while(true){
            System.out.println("Enter the name of item 1");
            item = input.next();

            System.out.println("Enter the price of the "+ item);
            price = input.nextDouble();

            System.out.println("How many cheese will you buy?");
            quantity = input.nextInt();

            System.out.println("Do you want to add more items to the shopping list?");
            String yesOrNo = input.next().toLowerCase();

            if(yesOrNo.equals("no")){
                break;
            }

            totalPrice = quantity *price;



        }

        System.out.println("SHOPPING LIST:" +item +"X"+ quantity + " = "+ "$"+totalPrice);





    }
}
