package hello2021.core.member;

/**
 * @author Gatsjy
 * @since 2021-01-04
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class MemberServiceImpl implements MemberService{

    // 배우가 직접 담당 배우를 섭외하는 것과 똑같다. -> 이건 모두 AppConfig가 해야한다!
    // 오로지 인터페이스만 존재한다...
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
