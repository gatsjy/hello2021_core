package hello2021.core.DiscountPolicy;

import hello2021.core.member.Grade;
import hello2021.core.member.Member;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int disount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price * discountPercent /100;
        }else{
            return 0;
        }
    }
}
