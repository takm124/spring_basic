package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //생성자 생성
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    /*@Autowired // 생성자가 1개일 경우 @Autowired 생략해도 자동으로 DI 진행
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }*/

    @Override

    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.fineById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice); // 할인 금액

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

}
