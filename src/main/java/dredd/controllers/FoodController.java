package dredd.controllers;

import dredd.entities.Food;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dredd.services.FoodService;

import java.util.List;

/**
 * Created by kudzimutamba on 2017/01/21.
 */
@RestController
public class FoodController {

  @RequestMapping("/food")
  public List<Food> food(@RequestParam(value="item", defaultValue="allFood") String item,
                         @RequestParam(value="liveTest", defaultValue="Test") String liveTest ){
    FoodService foodService = FoodService.getInstance(liveTest);
    return foodService.getFoodItem(item);
  }
}
