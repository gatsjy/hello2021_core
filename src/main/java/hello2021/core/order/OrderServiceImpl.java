package hello2021.core.order;

import hello2021.core.discount.DiscountPolicy;
import hello2021.core.member.Member;
import hello2021.core.member.MemberRepository;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
// 할인 정책을 변경하려면.. OrderServiceImpl을 고쳐야 한다.. -> 이걸 어떻게 리펙토링할 수 있을까?
public class OrderServiceImpl implements OrderService{

    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    // 밑의 코드는 구체코드에 의존하고 있다!!
    //  FixDiscountPolicy라고 구체적인 정책까지 선택하는 꼴이 된다..
    //  private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    // 구체적인 클래스에 대해서 전혀 모르는 상황이다!
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.disount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
