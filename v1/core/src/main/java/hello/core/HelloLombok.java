package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok hl = new HelloLombok();
        hl.setAge(10);
        hl.setName("kim");

        hl.getAge();
        hl.getName();
    }
}
