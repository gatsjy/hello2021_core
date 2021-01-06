package hello2021.core;

import hello2021.core.member.Grade;
import hello2021.core.member.Member;
import hello2021.core.member.MemberService;
import hello2021.core.member.MemberServiceImpl;
import hello2021.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class MemberApp {
    public static void main(String[] args) {
        //AppConfig appConfig =new AppConfig();
        //MemberService memberService = appConfig.memberService();

        // AppConfig에 있는 환경설정 정보를 가지고 스프링 컨테이너에 객체 생성해서 넣어준다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(memberA.getId());
        System.out.println("new Member = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
