package dredd.services;

import dredd.common.Common;
import dredd.entities.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kudzimutamba on 2017/01/20.
 */

public class FoodService {
  private List<Food> foodList;

  private static FoodService instance = null;

  public static FoodService getInstance(String test) {
    if (instance == null) {
      instance = new FoodService(test);
    }
    return instance;
  }

  private FoodService() {
    foodList = new ArrayList<>();
  }

  private FoodService(String test) {
    foodList = new ArrayList<>();
    if (test.equals(Common.TestLiveType.test.getName())) {
      //put some initial
      Food food = new Food("beans", "13423432-329873284");
      foodList.add(food);
    }
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
