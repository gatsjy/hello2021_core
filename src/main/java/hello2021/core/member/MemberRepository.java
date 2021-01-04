package hello2021.core.member;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
