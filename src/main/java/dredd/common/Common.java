package dredd.common;


/**
 * Created by kudzimutamba on 2017/01/21.
 */
public class Common {
  public enum TestLiveType{
    live("Live"),
    test("Test");

    private String name;

    TestLiveType(String name){
      this.name = name;
    }

    public String getName(){
      return  this.name;
    }

    public static TestLiveType findByName(String name)	{
      for(TestLiveType enumEntry : TestLiveType.values()) {
        if(enumEntry.getName().equals(name)) {
          return enumEntry; }
      }
      return null;
    }

  }
}
