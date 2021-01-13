package hello2021.core.discount;

import hello2021.core.member.Member;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int disount(Member member, int price);
    
}
