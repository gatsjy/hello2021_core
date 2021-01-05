package hello2021.core;

import hello2021.core.member.Grade;
import hello2021.core.member.Member;
import hello2021.core.member.MemberService;
import hello2021.core.member.MemberServiceImpl;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig =new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(memberA.getId());
        System.out.println("new Member = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
