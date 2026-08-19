package Delivery;


import Restaurant.Order;
import Restaurant.Restaurant;

public class Delivery {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" RESTAURANT FOOD ORDER SYSTEM");
        System.out.println("========================================");


        Restaurant restaurant = new Restaurant(
                101, "RKode Restaurant", "Chennai",
                "Pizza", 250,
                "Burger", 150,
                "Pasta", 200
        );
        restaurant.displayRestaurantDetails();
        System.out.println();

        Order order = new Order(5001, "Arun", "Pizza", 2, 250);

      
        order.calculateOrderAmount();
        order.displayOrderDetails();
        System.out.println("========================================");

        System.out.println();
        System.out.println("Direct access restaurant.restId -> compiler error (private field)");
        System.out.println("Using getter restaurant.getRestId() -> " + restaurant.getRestId());

        System.out.println();
        System.out.println("Changing restaurant name using setter: restaurant.setName(\"RKode Food Corner\")");
        restaurant.setName("RKode Food Corner");
        System.out.println();
        restaurant.displayRestaurantDetails();
    }
}
