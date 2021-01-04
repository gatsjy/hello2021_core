package hello2021.core.member;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
