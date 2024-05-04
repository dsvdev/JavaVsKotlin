package string_patterns;

public class User {
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private final String name;
    private final int age;


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}
