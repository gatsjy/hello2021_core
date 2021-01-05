package hello2021.core;

import hello2021.core.DiscountPolicy.FixDiscountPolicy;
import hello2021.core.member.MemberService;
import hello2021.core.member.MemberServiceImpl;
import hello2021.core.member.MemoryMemberRepository;
import hello2021.core.order.OrderService;
import hello2021.core.order.OrderServiceImpl;

/**
 * @author Gatsjy
 * @since 2021-01-05
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

// 생성자 주입의 예..
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }
}
