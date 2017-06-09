package example1;

/**
 * Created by shindep on 07/06/17.
 */
public class cheeseSandwich extends sandwich {

    boolean customerWantsVegetables() {
        return false;
    }

    // This wont execute!!!!
    void addVeggie() {
        System.out.println("Add Veggies");
    }

    void addCheese() {
      System.out.println("Add Cheese");
    }

    void addSauce() {
        System.out.println("Add Sauce");
    }

}
