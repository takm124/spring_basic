>2022.08.01

- What I Learn
    - 진도 : 스프링 핵심 원리 이해1 - 예제만들기 부분
    - 가장 기본적인 회원가입, 주문의 형태지만 생각해볼 부분이 많았다.
    - 포인트
        - 인터페이스 - 클래스 구현 부분 (강의에서는 역할과 구현이라고 표현한다.)
        - JUnit을 활용한 테스트
        - 기본적으로 서비스를 구현할 때의 접근방식에 대한 생각
        - 객체 지향 설계의 5가지 원칙 (SOLID)는 알고는 있지만 적용하기 참 어렵다고 생각한다. 공부가 더 필요해!<br>
  
<br>

- 고민해볼 수 있는것
  - 인터페이스를 사용해야만 하는 이유는?
    - 단순하게 하나의 서비스가 필요한 경우에도 interface-class, 역할-구현을 나눠야할까? 물론 이런 경우가 많진 않지만 같은 형태로 가져가는것이 좋을까?
  - JUnit을 활용한 테스트의 장점은 무엇인가?
    - 이 부분은 현업에서의 경험이 중요하다고 생각하다. 임의로 만들수 있는 테스트는 은근히 한계가 있어보임

<br>

- 고민 1 (인터페이스를 사용해야만 하는 이유는?)
  - '자바 인터페이스 사용이유'에 대한 구글링으로 나온 결과
    - 협업, 교체 용이, 다중 상속, 이 외의 다양한 디자인 패턴의 활용을 위해
    - 실제로 디자인 패턴을 공부할 때 무수한 interface의 생성을 볼수 있었는데, '잘' 사용하는 것이 무엇보다 중요하다.
    - 당연히 이런 방식을 사용하는게 좋지만, 현업에서 일을 하다보면 쉽게 인지할 수 없는 부분이다. 다양한 케이스를 접해보는것이 중요한 것 같다.
  
<br>

- 고민 2 (JUnit을 활용한 테스트의 장점은 무엇인가?)
  - 테스트를 원하는 부분만 고립시켜 진행하기 때문에 속도가 빠름
  - 수행 결과 판별을 텍스트, equals, ==로 확인하는게 아니라서 편함 (assert 활용)
  - jUnit을 검색하면 자연스레 TDD에 대한 주제가 같이 나오는데 이 부분도 추후에 공부가 필요하다고 생각됨


<br>
<br>
<br>

  >2022.08.02

  - What I Learn
    - 진도 : 스프링 핵심 원리 이해2 - 객체 지향 원리 적용
    - 포인트
      - OCP, DIP등 객체 지향의 원칙을 실제 코드에 적용시킨 것
      - 객체 지향의 원칙을 적용하는 것이 왜 중요한가
      - AppConfig를 추가시킴으로써 사용 영역과 구성 영역을 나누는 것
      - IoC, DI의 의미
      - 스프링 컨테이너의 역할

<br>

- 고민해볼 수 있는것
  - 객체지향의 5 원칙에 대한 고찰
    - 객체 지향의 5원칙을 공부하다보면 은근히 겹치는 부분도 많고, 예시마다 강조하는 부분이 다르다. 이 부분의 명확한 공부가 필요하다.
  - 스프링 컨테이너의 역할
    - 현재는 Bean을 보관하는것에 그치지만 이후에 스프링 컨테이너의 역할을 계속해서 주시해야 할것
  - @Configuration을 사용했을 때 내부적으로 변화되는 로직
    - Configuration이 구성요소임을 알려주는 flag 역할인데, 실제 구동시에 어떤식으로 영향을 미치는지 알아둘 필요가 있을 것 같다.

<br>

- 한마디
  - 회사 프로젝트에서 실제로 개발이 이루어질 때 가장 중요한 것이 설계라고 생각 된다. 지금은 강의 에서 이해하기 가장 쉬우면서도 깔끔한 방식의 설계를 보여주고 있지만, 실제 서비스에서의 설계는 고민할 부분이 참 많다.<br><br>여러 회사의 코드를 보고, 어떤식으로 설계를 했는지 접하지만 전부 가지각색이라 아직까지 한눈에 구성이 이해가 되지 않는다. 이 부분에 대한 숙련도를 어떻게 채워야 할지 걱정된다.
  


  >2022.08.05

  - What I Learn
    - 진도 : 스프링 컨테이너와 스프링 빈
    - 포인트
      - BeanFactory와 ApplicationContext의 차이점 이해
      - Bean이 어떻게 관리되는지
      - Bean 정보를 어떻게 알 수 있는지
      - BeanDefinition

<br>

- 고민해볼 수 있는것
  - 실제 현업 개발환경에서 ApplicationContext 세팅을 어떻게 하는지
    - 기능 개발도 중요하지만 개발시에 가장 우선시 되는 것이 환경세팅이다. 혼자 프로젝트도 진행해보았지만, 이 부분을 깊게 공부해본적은 없는 것 같다. 시간을 내서 봐야할 필요성을 느낀다.

<br>


  >2022.08.08

  - What I Learn
    - 진도 : 싱글톤 컨테이너, 컴포넌트 스캔
    - 포인트
      - 싱글톤이 사용되어야 하는 이유
      - @Configuration 작동원리
      - Spring vs SpringBoot
      - @Component, @Controller, @Repository, @Service 차이점

<br>

- 고민해볼 수 있는것
  - 싱글톤의 장단점 -> 싱글톤이 안티패턴이라고 불리는 이유는?
  - 스프링의 각 어노테이션들의 역할에 대한 이해
  - @Autowired 방식 DI의 문제점
  - @Controller와 @Service의 실질적으로 처리할 수 있는 기능적 차이가 있는지

<br>

  >2022.08.20

  - What I Learn
    - 진도 : 의존관계 자동주입
    - 포인트
      - 의존 관계 주입 방법들과 각각의 특징
      - 생성자 주입을 권장하는 이유
      - Lombok 활용
      - @Qualifier, @Primary
      - Annotation 활용
      

<br>

- 고민해볼 수 있는것
  - 의존 관계 주입시 필드 주입을 권장하지 않는 이유 

<br>


  >2022.08.22

  - What I Learn
    - 진도 : 서블릿
    - 포인트
      - logging.level.org.apache.coyote.http11 = debug 사용  // 개발단계에서만 사용하기 
      - 서블릿이란 무엇인가
      - 웰컴 페이지
      - HTTP 요청 req, rep 구조

<br>

- 고민해볼 수 있는것
  - 이번 서블릿 강의는 기본적인 HTTP 사용법에 대한 강의 <br>
    예전에 정리했던 http 자료 복습하기
  - EOFException 이란?

<br>


 >2022.08.23

  - What I Learn
    - 진도 : 서블릿, JSP, MVC 패턴
    - 포인트
      - 기본적인 JSON 파싱 (jackson 사용)
      - HttpServletResponse 메시지 컨트롤
      - Response header들 이해
      - application/json과 charset=utf-8 // 이거 현업에서 은근히 많이 보임
      - 동시성에 대한 고민
      - 템플릿 엔진의 필요성
      - JSP 기본적인 활용법 -> 템플릿 엔진의 큰 틀은 비슷하다.
      - 서블릿과 JSP의 한계
      - MVC 패턴이란? (장단점)
      - WEB-INF 밑에 있는 자원은 외부에서 호출해도 호출되지 않는다.
      - JSP의 프로퍼티 접근법
      - MVC 패턴의 한계


<br>

- 고민해볼 수 있는것
  - 클라이언트 요청 -> request -> 분석 -> response flow를 세세하게 이해해보기
  - Cache-Control header와 실무에서 활용도 -> 캐시 활용이 중요한 이유는?
  - ConcurrentHashMap과 AtomicLong이란?
  - JSP에서 request, response를 그냥 사용할 수 있는 이유
  - forward와 sendRedirect 차이 (https://mangkyu.tistory.com/51)
    - 추후에 중복 POST 이슈와 연관되어 있음(새로고침 이슈, PRG)
    - 새로고침에 대한 이해도 필요함


<br>


 >2022.08.25

  - What I Learn
    - 진도 : MVC 프레임워크 만들기
    - 포인트
      - FrontController 구조에서 MVC 구조로 발전해가는 Step을 설명해주는 챕터이다. 복습하면서 발전 과정을 숙지하는 것이 관건
      - 각 스텝에서 어떤 단점을 극복했는지 정리해볼것
      - 코드 자체를 이해하는 것이 이번 챕터의 핵심


<br>

- 고민해볼 수 있는것
  - 기능적인 부분보다 아키텍처에 대한 고민을 해보자.
  - ModelAndView랑 그냥 Model만 다루는 경우(예제 v3, v4)의 이해가 필요


<br>

 >2022.08.26

  - What I Learn
    - 진도 : 스프링 MVC - 구조이해
    - 포인트
      - 기본적인 Spring MVC 활용


<br>

- 고민해볼 수 있는것
  - 기존 강의에서 만들었던 FrontController가 Spring에서 어떻게 적용되었는지


<br>

 >2022.09.13-14

  - What I Learn
    - 진도 : 스프링 MVC - 기본기능
    - 포인트
      - 각종 mapping 조건 (헤더, 파라미터, 미디어 타입 등...)
      - 기본적인 CRUD 요청 방법
      - 기본적인 데이터 매핑 방법 (RequestParam, ModelAttribute)
      - @Data가 지원해주는 것 정도는 암기해두기
      - HttpEntity
      - RequestBody
      - ResponseBody
      - Http 메시지 컨버터
      - Content-type을 놓치지 말자


<br>

- 고민해볼 수 있는것
  - 경로변수, url 파라미터를 각각 언제 사용하는것이 좋을 지
  - ModelAttribute와 RequestBody의 차이점
  - HTTP 요청시 데이터가 '어떻게' 넘어가는지, 서버에서 '어떻게' 보내주는지
  - 핸들러 어댑터의 동작원리에 대해 따로 한번 정리해볼것


<br>