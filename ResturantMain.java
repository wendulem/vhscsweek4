/**
 * Virtual High School
 * @author Connor Johnson
 */

package resturant;

import java.util.*;

public class ResturantMain
{
  private static Map<Integer, String> field_map;

  static
  {
    field_map = new HashMap<>();
    field_map.put(901, "Small Diet Coke");
    field_map.put(902, "Medium Diet Coke");
    field_map.put(903, "Large Diet Coke");
    field_map.put(301, "Regular Chicken Fingers");
    field_map.put(302, "Large Chicken Fingers");
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    System.out.println("Enter your name:");
    String username = sc.nextLine();
    System.out.println("Would you like to order(y or n)?");
    String condition = sc.next();
    if (condition.equals("y"))
    {
      String continueorder = "y";
      while (continueorder.equals("y"))
      {
        System.out.println("Enter your item:");
        int item = sc.nextInt();
        list.add(item);
        System.out.println("Would you like to continue(y or n)?");
        continueorder = sc.next();
      }

      String string = "";
      for (int i = 0; i < list.size(); i++)
      {
        if (i == 0)
        {
          string = field_map.get(list.get(i));
          continue;
        }
        string += ", " + field_map.get(list.get(i));
      }
      System.out.println(username + " your order is:");
      System.out.println(string);
    }
    if (condition.equals("n"))
    {
      System.exit(0);
    }

  }

}
