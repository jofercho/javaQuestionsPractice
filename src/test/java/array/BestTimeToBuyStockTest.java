package array;

import array.BestTimeToBuyStock;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BestTimeToBuyStockTest {

  @Test
  public void bestTimeToBuyStockTest() {
    int[] prices1 = {7, 1, 5, 3, 6, 4};
    int expectedSolution1 = 5;
    int[] prices2 = {7, 6, 4, 3, 1};
    int expectedSolution2 = 0;
    int[] prices3 = {7, 1, 5, 3, 6, 4};
    int expectedSolution3 = 5;
    int solution1 = new BestTimeToBuyStock().maxProfit(prices1);
    int solution2 = new BestTimeToBuyStock().maxProfit(prices2);
    int solution3 = new BestTimeToBuyStock().maxProfit(prices3);
    assertThat(solution1).isEqualTo(expectedSolution1);
    assertThat(solution2).isEqualTo(expectedSolution2);
    assertThat(solution3).isEqualTo(expectedSolution3);
  }
}
