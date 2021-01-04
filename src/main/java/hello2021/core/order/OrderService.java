package hello2021.core.order;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
