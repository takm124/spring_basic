package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // 자기 자신을 내부에 갖고있음, 딱 하나만

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { //외부에서 새로운 객체 생성이 되지 않게끔 private으로 막아둔다.
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출출");    }
}
