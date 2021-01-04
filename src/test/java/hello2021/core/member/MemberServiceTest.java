package hello2021.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
class MemberServiceTest {

    // MemberService가 인터페이스 뿐만 아니라 구현까지 의존하는 경향이 있다.. 그런 어떻게 리펙토링 해야 하는가?
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void findMember() {
    }
}