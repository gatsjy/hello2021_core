package hello2021.core;

import hello2021.core.discount.DiscountPolicy;
import hello2021.core.discount.FixDiscountPolicy;
import hello2021.core.discount.RateDiscountPolicy;
import hello2021.core.member.MemberRepository;
import hello2021.core.member.MemberService;
import hello2021.core.member.MemberServiceImpl;
import hello2021.core.member.MemoryMemberRepository;
import hello2021.core.order.OrderService;
import hello2021.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Gatsjy
 * @since 2021-01-05
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
