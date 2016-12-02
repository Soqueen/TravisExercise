import java.util.Random;

public class RandomDiscountStrategy
  implements DiscountStrategy {

  private Random rng;

  private RandomDiscountStrategy() {
    this.rng = new Random();
  }

  public float applyDiscount(Order order) {
    return order.getPrice() * rng.nextFloat();
  }
}
