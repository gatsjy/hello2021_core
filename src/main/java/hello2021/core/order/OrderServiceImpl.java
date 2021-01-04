package hello2021.core.order;

import hello2021.core.DiscountPolicy.DiscountPolicy;
import hello2021.core.DiscountPolicy.FixDiscountPolicy;
import hello2021.core.member.Member;
import hello2021.core.member.MemberRepository;
import hello2021.core.member.MemoryMemberRepository;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.disount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
