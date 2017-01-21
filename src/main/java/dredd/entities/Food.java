package dredd.entities;

/**
 * Created by kudzimutamba on 2017/01/20.
 */
public class Food {

  private String name;
  private String identity;
  private static int quantity = 0;

  public Food(String name, String identity) {
    quantity++;
    this.name = name;
    this.identity = identity;
  }

  public Food(Food food) {
    this.name = food.getName();
    this.identity = food.getIdentity();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public static int getQuantity() {
    return quantity;
  }

  public static void setQuantity(int quantity) {
    Food.quantity = quantity;
  }

}
