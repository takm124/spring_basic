package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// 동시성을 고려하는 경우 ConcurrentHashMap, AtomicLong
public class MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() { // 싱글톤

    }

    public Member save(Member member) {
        member.setId(++sequence); // Id 값 1 증가후 고유 id 설정
        store.put(member.getId(), member); // member 저장
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values()); // store를 보호하기위한 형태
    }

    public void clearStroe() {
        store.clear();

    }


}
