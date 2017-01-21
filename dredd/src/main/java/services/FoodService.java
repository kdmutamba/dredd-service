package services;

import entities.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudzimutamba on 2017/01/20.
 */
public class FoodService {
  private List<Food> foodList;

  private static FoodService instance = null;

  public static FoodService getInstance() {
    if (instance == null) {
      instance = new FoodService();
    }
    return instance;
  }

  private FoodService() {
    foodList = new ArrayList<>();
  }

  public void addFood(Food food) {
    foodList.add(food);
  }

  public Food removeFood(String name) {
    if (foodList.contains(name)) {
      for (Food food : foodList) {
        foodList.remove(food);
        return food;
      }
    }
    return null;
  }

  public List<Food> getFoodItem(String itemName) {
    if (itemName.equals("allFood")) {
      return foodList;
    } else {
      for (Food food : foodList) {
        if (food.getName().equals(itemName)) {
          List<Food> list = new ArrayList<>();
          list.add(new Food(food));
          return list;
        }
      }
    }
    return null;
  }

}
