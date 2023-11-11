/**
 *
 *  @author Provarau Ilya S26850
 *
 */

package zad1;


import java.util.*;

public class Main {

  static List<String> getPricesInPLN(List<String> destinations, double xrate) {
    return ListCreator.collectFrom(destinations)
                       .when(elem -> elem.startsWith("WAW"))
                       .mapEvery(elem -> {
                         String[] tokenized = elem.split(" ");
                         return "to " + tokenized[1] + " - price in PLN: " + (int) (Double.parseDouble(tokenized[2]) * xrate);
                       });
  }

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
    List<String> result = getPricesInPLN(dest, ratePLNvsEUR);
    for (String r : result) System.out.println(r);
  }
}
