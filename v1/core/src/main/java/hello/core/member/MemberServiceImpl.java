package hello.core.member;

public class MemberServiceImpl implements  MemberService{

    //private final MemberRepository memberRepository = new MemoryMemberRepository(); // before
    private final MemberRepository memberRepository; //after

    // 생성자를 통해서 구현체에 뭐가 들어갈지 정함
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.fineById(memberId);
    }

}
