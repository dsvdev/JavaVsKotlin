package infix_function;

import string_patterns.User;

public class InfixFunctionJava {
    public static void main(String[] args) {
        User user = new User("Name", 25);
        User user2 = new User("Name2", 27);
        if (olderThen(user, user2)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    public static boolean olderThen(User u1, User u2) {
        return u1.getAge() > u2.getAge();
    }


}
