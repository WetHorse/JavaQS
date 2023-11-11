/**
 *
 *  @author Provarau Ilya S26850
 *
 */

package zad2;


/*<-- necessary imports */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    // List of destination: departure_airport destination_airport price_EUR
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = dest.stream().
            filter(elem -> elem.startsWith("WAW")).
            map(elem -> {
              String[] tokenizedString = elem.split(" ");
              return "to " + tokenizedString[1] + " - price in PLN: " + (int) (Double.parseDouble(tokenizedString[2]) * ratePLNvsEUR);
            }).collect(Collectors.toList());

    for (String r : result) System.out.println(r);
  }
}
